package com.yskj.mater.encryption;

import java.lang.annotation.*;

/**
 * @Author nc
 * @Date 2019/7/25 9:17
 * 用于判断指定方法参数是否需要解密，响应值是否需要加密
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Encryption {
    /**
     * 参数是否需要解密，默认不解密
     * @return
     */
    boolean encodeRequest() default false;
    /**
     * 响应是否需要加密，默认不加密
     * @return
     */
    boolean encodeResponse() default false;

}
