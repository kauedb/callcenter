package spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import spring.bean.SpringService1;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 10/19/13
 * Time: 2:25 PM
 */
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = TestConfig.class)
public class SpringTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private SpringService1 springService1;

    @Test
    public void test(){
        springService1.m();
    }


}
