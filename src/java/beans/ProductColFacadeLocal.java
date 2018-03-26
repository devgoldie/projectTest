/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.ProductCol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author htp06
 */
@Local
public interface ProductColFacadeLocal {

    void create(ProductCol productCol);

    void edit(ProductCol productCol);

    void remove(ProductCol productCol);

    ProductCol find(Object id);

    List<ProductCol> findAll();

    List<ProductCol> findRange(int[] range);

    int count();
    
}
