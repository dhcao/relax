package com.xiawan;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by dhcao. on 2018/3/26.
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@AutoConfigurationPackage
public class SpringBootApplicationStart extends SpringBootServletInitializer {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(SpringBootApplicationStart.class);
    }
}
