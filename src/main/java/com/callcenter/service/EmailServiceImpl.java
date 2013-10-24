package com.callcenter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 10/8/13
 * Time: 10:54 PM
 */
@Service
public class EmailServiceImpl implements EmailService, Runnable, Callable<Object>{

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailServiceImpl.class);

    @Async
    @Override
    public void sendEmail(int i){

        LOGGER.info("email sent!!! " + i + ", thread=" + Thread.currentThread().getId());
    }


    @Override
    public Object call() throws Exception {
        System.out.println("hello callable");
        return new String();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void run() {
        System.out.println("hello runnable");
    }
}
