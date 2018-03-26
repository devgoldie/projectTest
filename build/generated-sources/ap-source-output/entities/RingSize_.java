package entities;

import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(RingSize.class)
public class RingSize_ { 

    public static volatile CollectionAttribute<RingSize, Product> productCollection;
    public static volatile SingularAttribute<RingSize, Integer> ringSizeID;
    public static volatile SingularAttribute<RingSize, Integer> priceModifier;
    public static volatile SingularAttribute<RingSize, String> ringSizeValue;

}