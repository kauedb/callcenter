package com.callcenter.service;

import org.springframework.scheduling.annotation.Async;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 10/9/13
 * Time: 12:50 AM
 */
public interface EmailService {
    @Async
    void sendEmail(int i);
}
