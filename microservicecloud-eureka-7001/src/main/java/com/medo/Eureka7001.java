package com.medo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: Eureka7001
 * @Auther: medo
 * @Date: 2020-03-19 13:45
 * @Description: TODO
 **/
@EnableEurekaServer
@SpringBootApplication
public class Eureka7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001.class, args);
    }
}
