package entities;

import entities.Customer;
import entities.Product;
import entities.ReviewPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(Review.class)
public class Review_ { 

    public static volatile SingularAttribute<Review, String> adminResponse;
    public static volatile SingularAttribute<Review, Product> product;
    public static volatile SingularAttribute<Review, Date> dateCreated;
    public static volatile SingularAttribute<Review, Double> rating;
    public static volatile SingularAttribute<Review, String> title;
    public static volatile SingularAttribute<Review, ReviewPK> reviewPK;
    public static volatile SingularAttribute<Review, String> content;
    public static volatile SingularAttribute<Review, Date> dateUpdated;
    public static volatile SingularAttribute<Review, Customer> customer;

}