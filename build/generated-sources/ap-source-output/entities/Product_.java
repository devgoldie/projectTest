package entities;

import entities.Bookmark;
import entities.Category;
import entities.OrderDetail;
import entities.ProductCol;
import entities.ProductDiscount;
import entities.ProductImage;
import entities.Review;
import entities.RingSize;
import entities.Variant;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> unitsInStock;
    public static volatile SingularAttribute<Product, Integer> unitPrice;
    public static volatile CollectionAttribute<Product, Variant> variantCollection;
    public static volatile SingularAttribute<Product, Integer> productID;
    public static volatile CollectionAttribute<Product, Category> categoryCollection;
    public static volatile CollectionAttribute<Product, OrderDetail> orderDetailCollection;
    public static volatile CollectionAttribute<Product, RingSize> ringSizeCollection;
    public static volatile SingularAttribute<Product, Boolean> discontinued;
    public static volatile SingularAttribute<Product, String> productName;
    public static volatile SingularAttribute<Product, Integer> unitsOnOrder;
    public static volatile SingularAttribute<Product, Date> dateUpdated;
    public static volatile SingularAttribute<Product, String> productDesc;
    public static volatile SingularAttribute<Product, Date> dateCreated;
    public static volatile CollectionAttribute<Product, Bookmark> bookmarkCollection;
    public static volatile CollectionAttribute<Product, ProductImage> productImageCollection;
    public static volatile SingularAttribute<Product, ProductCol> colID;
    public static volatile SingularAttribute<Product, ProductDiscount> discountID;
    public static volatile CollectionAttribute<Product, Review> reviewCollection;
    public static volatile SingularAttribute<Product, Integer> basePrice;

}