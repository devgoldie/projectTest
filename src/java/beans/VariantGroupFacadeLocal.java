/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.VariantGroup;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author htp06
 */
@Local
public interface VariantGroupFacadeLocal {

    void create(VariantGroup variantGroup);

    void edit(VariantGroup variantGroup);

    void remove(VariantGroup variantGroup);

    VariantGroup find(Object id);

    List<VariantGroup> findAll();

    List<VariantGroup> findRange(int[] range);

    int count();
    
}
