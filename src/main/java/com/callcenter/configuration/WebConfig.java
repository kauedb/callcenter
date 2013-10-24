package com.callcenter.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 9/24/13
 * Time: 3:08 PM
 */
@Configuration
@ComponentScan(basePackages = "com.callcenter.mvc")
@EnableWebMvc
public class WebConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebConfig.class);

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        final InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }


    @Bean
    public JndiObjectFactoryBean userBean(){
        final JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("java:global/callcenter/UserBeanImpl");
        return jndiObjectFactoryBean;
    }


}

