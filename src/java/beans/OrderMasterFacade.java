/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entities.OrderMaster;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author htp06
 */
@Stateless
public class OrderMasterFacade extends AbstractFacade<OrderMaster> implements OrderMasterFacadeLocal {
    @PersistenceContext(unitName = "Project_TestPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderMasterFacade() {
        super(OrderMaster.class);
    }
    
}