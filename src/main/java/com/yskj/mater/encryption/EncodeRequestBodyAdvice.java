package com.yskj.mater.encryption;

import com.yskj.mater.util.Base64Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.lang.reflect.Type;

/**
 * @Author nc
 * @Date 2019/7/25 10:32
 * 1：判断数据是否需要解密
 * 2：需要加密进行数据解密(base64)
 * 3：返回数据
 */
@ControllerAdvice
public class EncodeRequestBodyAdvice implements RequestBodyAdvice{
    private static final Logger log= LoggerFactory.getLogger(EncodeRequestBodyAdvice.class);

    @Override
    public boolean supports(MethodParameter methodParameter, Type type, Class <? extends HttpMessageConverter <?>> aClass) {
        return true;
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class <? extends HttpMessageConverter <?>> aClass) throws IOException {
        /*参数解密:默认不解密*/
        boolean flag=false;
        if(methodParameter.getMethod().isAnnotationPresent(Encryption.class)){
            Encryption encryption=methodParameter.getMethodAnnotation(Encryption.class);
            flag=encryption.encodeRequest();
        }
        if(flag){
            log.info("方法"+methodParameter.getMethod().getName()+"参数已解密...");
            /*参数解密*/
            return  new HttpInputMessage() {
                @Override
                public InputStream getBody() throws IOException {
                    InputStream inputStream=httpInputMessage.getBody();
                    StringBuffer sb=new StringBuffer();
                    byte[] by=new byte[1024];
                    int len=-1;
                    while ((len=inputStream.read(by))!=-1){
                        sb.append(new String( by,0,len ));
                    }
                    log.info("未解密的数据"+sb.toString());
                    String pamer=sb.toString();
                    String str2= Base64Util.decode( pamer.getBytes() );
                    log.info( str2+"数据打印----------");
                    StringBufferInputStream stringBufferInputStream=new StringBufferInputStream(str2);
                    return stringBufferInputStream;
                }

                @Override
                public HttpHeaders getHeaders() {
                    return httpInputMessage.getHeaders();
                }
            };
        }else{
            log.info("方法"+methodParameter.getMethod().getName()+"参数未解密...");
        }
        return httpInputMessage;
    }

    @Override
    public Object afterBodyRead(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class <? extends HttpMessageConverter <?>> aClass) {
        return o;
    }

    @Override
    public Object handleEmptyBody(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class <? extends HttpMessageConverter <?>> aClass) {
        return o;
    }
}
