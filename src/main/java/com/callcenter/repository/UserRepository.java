package com.callcenter.repository;

import com.callcenter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 10/5/13
 * Time: 3:41 PM
 */
public interface UserRepository extends JpaRepository<User, Long> {



}
