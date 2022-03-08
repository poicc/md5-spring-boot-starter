package com.soft.crq.auto;

import com.soft.crq.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: crq
 * @create: 2022-03-08 20:45
 **/
@Configuration
public class MD5AutoConfiguration {

    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}
