/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.CustomerAddress;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author htp06
 */
@Local
public interface CustomerAddressFacadeLocal {

    void create(CustomerAddress customerAddress);

    void edit(CustomerAddress customerAddress);

    void remove(CustomerAddress customerAddress);

    CustomerAddress find(Object id);

    List<CustomerAddress> findAll();

    List<CustomerAddress> findRange(int[] range);

    int count();
    
}
