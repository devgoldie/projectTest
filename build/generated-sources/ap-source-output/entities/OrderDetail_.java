package entities;

import entities.OrderDetailPK;
import entities.OrderMaster;
import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Integer> unitPrice;
    public static volatile SingularAttribute<OrderDetail, Product> product;
    public static volatile SingularAttribute<OrderDetail, Integer> quantity;
    public static volatile SingularAttribute<OrderDetail, OrderMaster> orderMaster;
    public static volatile SingularAttribute<OrderDetail, Integer> discount;
    public static volatile SingularAttribute<OrderDetail, String> ringSize;
    public static volatile SingularAttribute<OrderDetail, OrderDetailPK> orderDetailPK;

}