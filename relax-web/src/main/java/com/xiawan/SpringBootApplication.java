package com.xiawan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by dhcao. on 2018/3/26.
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@AutoConfigurationPackage
public class SpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
    }
}
