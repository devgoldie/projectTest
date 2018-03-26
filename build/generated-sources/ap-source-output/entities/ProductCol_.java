package entities;

import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(ProductCol.class)
public class ProductCol_ { 

    public static volatile SingularAttribute<ProductCol, String> colImage;
    public static volatile SingularAttribute<ProductCol, String> colName;
    public static volatile SingularAttribute<ProductCol, String> colDesc;
    public static volatile CollectionAttribute<ProductCol, Product> productCollection;
    public static volatile SingularAttribute<ProductCol, Integer> colID;

}