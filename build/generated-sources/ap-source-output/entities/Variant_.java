package entities;

import entities.Product;
import entities.VariantGroup;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(Variant.class)
public class Variant_ { 

    public static volatile CollectionAttribute<Variant, Product> productCollection;
    public static volatile SingularAttribute<Variant, VariantGroup> variantGroupID;
    public static volatile SingularAttribute<Variant, String> variantValue;
    public static volatile SingularAttribute<Variant, Integer> variantID;

}