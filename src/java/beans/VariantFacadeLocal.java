/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.Variant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author htp06
 */
@Local
public interface VariantFacadeLocal {

    void create(Variant variant);

    void edit(Variant variant);

    void remove(Variant variant);

    Variant find(Object id);

    List<Variant> findAll();

    List<Variant> findRange(int[] range);

    int count();
    
}
