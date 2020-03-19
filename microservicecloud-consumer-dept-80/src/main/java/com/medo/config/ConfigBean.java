package com.medo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConfigBean
 * @Auther: medo
 * @Date: 2020-03-17 13:14
 * @Description: TODO
 **/
@Configuration
public class ConfigBean {

    // 使用restTemplate更优雅的操作http间的调用
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
