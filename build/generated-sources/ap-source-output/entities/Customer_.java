package entities;

import entities.Bookmark;
import entities.CustomerAddress;
import entities.OrderMaster;
import entities.Review;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile SingularAttribute<Customer, String> gender;
    public static volatile SingularAttribute<Customer, String> phone2;
    public static volatile SingularAttribute<Customer, Date> dateOfBirth;
    public static volatile SingularAttribute<Customer, Integer> membership;
    public static volatile SingularAttribute<Customer, String> userName;
    public static volatile SingularAttribute<Customer, Date> dateUpdated;
    public static volatile SingularAttribute<Customer, String> phone1;
    public static volatile SingularAttribute<Customer, Integer> points;
    public static volatile CollectionAttribute<Customer, OrderMaster> orderMasterCollection;
    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile CollectionAttribute<Customer, CustomerAddress> customerAddressCollection;
    public static volatile SingularAttribute<Customer, Date> dateCreated;
    public static volatile SingularAttribute<Customer, Boolean> freeShipping;
    public static volatile CollectionAttribute<Customer, Bookmark> bookmarkCollection;
    public static volatile SingularAttribute<Customer, Integer> customerID;
    public static volatile SingularAttribute<Customer, Integer> discountValue;
    public static volatile CollectionAttribute<Customer, Review> reviewCollection;
    public static volatile SingularAttribute<Customer, String> email;

}