/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.Bookmark;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author htp06
 */
@Local
public interface BookmarkFacadeLocal {

    void create(Bookmark bookmark);

    void edit(Bookmark bookmark);

    void remove(Bookmark bookmark);

    Bookmark find(Object id);

    List<Bookmark> findAll();

    List<Bookmark> findRange(int[] range);

    int count();
    
}
