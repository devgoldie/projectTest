package entities;

import entities.Customer;
import entities.OrderDetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(OrderMaster.class)
public class OrderMaster_ { 

    public static volatile SingularAttribute<OrderMaster, Date> dateCreated;
    public static volatile CollectionAttribute<OrderMaster, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<OrderMaster, Integer> orderID;
    public static volatile SingularAttribute<OrderMaster, Integer> shipType;
    public static volatile SingularAttribute<OrderMaster, Customer> customerID;
    public static volatile SingularAttribute<OrderMaster, Date> dateShipped;
    public static volatile SingularAttribute<OrderMaster, Integer> orderStatus;
    public static volatile SingularAttribute<OrderMaster, Integer> shipFee;
    public static volatile SingularAttribute<OrderMaster, String> shipName;
    public static volatile SingularAttribute<OrderMaster, String> shipAddress;

}