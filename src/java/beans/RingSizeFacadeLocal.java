/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.RingSize;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author htp06
 */
@Local
public interface RingSizeFacadeLocal {

    void create(RingSize ringSize);

    void edit(RingSize ringSize);

    void remove(RingSize ringSize);

    RingSize find(Object id);

    List<RingSize> findAll();

    List<RingSize> findRange(int[] range);

    int count();
    
}
