package ejb.bean;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.testng.annotations.Test;

import javax.ejb.EJB;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 10/19/13
 * Time: 11:03 AM
 */

public class ArquillianTest extends Arquillian {

    @EJB
    private StatelessBean1 greetingManager;

    @Deployment
    public static JavaArchive createTestArchive() {

        return ShrinkWrap.create(JavaArchive.class, "test.jar")
                .addClasses(StatelessBean1.class);

    }

    @Test
    public void shouldBeAbleToInjectEJB() throws Exception {

        greetingManager.m();

    }

}
