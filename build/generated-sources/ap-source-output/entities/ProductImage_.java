package entities;

import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(ProductImage.class)
public class ProductImage_ { 

    public static volatile SingularAttribute<ProductImage, String> imageLink;
    public static volatile SingularAttribute<ProductImage, Integer> imageID;
    public static volatile SingularAttribute<ProductImage, Product> productID;

}