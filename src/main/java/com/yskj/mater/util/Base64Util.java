package com.yskj.mater.util;


import com.sun.org.apache.xml.internal.security.utils.Base64;

/**
 * @Author nie.c
 * @Date 2019/8/15 14:34
 * Base64 加密，解密
 */
public class Base64Util {
    /**
     * 加密
     * @param bytes
     * @return String
     */
    public static String encode(byte[] bytes){
        return new String( Base64.encode(bytes));
    }

    /**
     * 解密
     * @param bytes
     * @return String
     */
    public static String decode(byte[] bytes){
        try{
            return new String( Base64.decode( bytes ));
        }catch (Exception e){
            return null;
        }
    }
}
