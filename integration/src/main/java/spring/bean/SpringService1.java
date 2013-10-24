package spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 10/19/13
 * Time: 2:28 PM
 */
@Service
public class SpringService1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringService1.class);

    @Transactional(propagation = Propagation.SUPPORTS)
    public void m(){
        LOGGER.info("executed!!!");
    }

}
