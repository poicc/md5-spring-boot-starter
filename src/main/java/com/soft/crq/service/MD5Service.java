package com.soft.crq.service;

import com.soft.crq.util.MD5Util;

/**
 * @description:
 * @author: crq
 * @create: 2022-03-08 20:45
 **/
public class MD5Service {

    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}
