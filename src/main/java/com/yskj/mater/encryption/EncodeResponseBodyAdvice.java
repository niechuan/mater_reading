package com.yskj.mater.encryption;

import com.yskj.mater.util.Base64Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
/**
 * @Author nc
 * @Date 2019/7/25 9:34
 * 1：判断数据是否需要加密
 * 2：需要加密进行数据加密(base64)
 * 3：返回数据
 */
@ControllerAdvice
public class EncodeResponseBodyAdvice implements ResponseBodyAdvice{
    private static final Logger log= LoggerFactory.getLogger(EncodeResponseBodyAdvice.class);
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        log.info("方法"+methodParameter.getMethod().getName()+"执行中");
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        /*是否加密,默认false不加密*/
        boolean flag=false;
        /*判断方法是否使用指定注解*/
        if(methodParameter.getMethod().isAnnotationPresent(Encryption.class)){
            /*获取次注解的配置包含字段*/
            Encryption encryption=methodParameter.getMethodAnnotation(Encryption.class);
            flag=encryption.encodeResponse();
        }
        if(flag){
            log.info("方法"+methodParameter.getMethod().getName()+"响应数据已进行加密");
           /* Map<String,Object> map=new HashMap <>( );
            map.put( "code",200 );
            map.put( "msg","请求成功.");*/
            String base64=null;
            if(o!=null){
                /*加密*/
                base64= Base64Util.encode( o.toString().getBytes() );
                log.info( "加密结果:"+base64 );
                /*map.put( "data",base64 );*/
            }else{
                /*map.put( "data",0);*/
            }
            return base64;
        }else{
            log.info("方法"+methodParameter.getMethod().getName()+"响应数据未加密");
            return o;
        }

    }
}
