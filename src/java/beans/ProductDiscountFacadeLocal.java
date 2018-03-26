/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.ProductDiscount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author htp06
 */
@Local
public interface ProductDiscountFacadeLocal {

    void create(ProductDiscount productDiscount);

    void edit(ProductDiscount productDiscount);

    void remove(ProductDiscount productDiscount);

    ProductDiscount find(Object id);

    List<ProductDiscount> findAll();

    List<ProductDiscount> findRange(int[] range);

    int count();
    
}
