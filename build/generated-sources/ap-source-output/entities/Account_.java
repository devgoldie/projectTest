package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-03-25T15:57:24")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Integer> accountID;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, String> role;
    public static volatile SingularAttribute<Account, Date> dateCreated;
    public static volatile SingularAttribute<Account, String> phone;
    public static volatile SingularAttribute<Account, String> userName;
    public static volatile SingularAttribute<Account, String> email;
    public static volatile SingularAttribute<Account, Date> dateUpdated;

}