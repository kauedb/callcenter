package ejb.bean;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 10/19/13
 * Time: 2:30 PM
 */
@Stateless
public class StatelessBean1 {

    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void m(){

    }

}
