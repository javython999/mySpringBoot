package com.example.config.autoconfig;

import com.example.config.MyAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@MyAutoConfiguration
public class DispatcherServletConfiguration {
    @Bean
    public DispatcherServlet dispatcherServlet () {
        return new DispatcherServlet();
    }
}
