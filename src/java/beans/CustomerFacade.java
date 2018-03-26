package beans;

import entities.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author htp06
 */
@Stateless
public class CustomerFacade extends AbstractFacade<Customer> implements CustomerFacadeLocal {

    @PersistenceContext(unitName = "Project_TestPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerFacade() {
        super(Customer.class);
    }

    @Override
    public List<Customer> searcByFirstName(String firstName) {
        try {
            String query = "SELECT c FROM Customer c WHERE c.firstName LIKE :firstName "
                    + "OR c.lastName LIKE :firstName "
                    + "OR c.email LIKE :firstName";
            Query q = em.createQuery(query);
            q.setParameter("firstName", "%" + firstName + "%");
            return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Customer> searchByLastName(String searchTitle) {
        return null;
    }
    
    

}
