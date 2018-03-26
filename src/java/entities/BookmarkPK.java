/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author htp06
 */
@Embeddable
public class BookmarkPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CustomerID", nullable = false)
    private int customerID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID", nullable = false)
    private int productID;

    public BookmarkPK() {
    }

    public BookmarkPK(int customerID, int productID) {
        this.customerID = customerID;
        this.productID = productID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) customerID;
        hash += (int) productID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookmarkPK)) {
            return false;
        }
        BookmarkPK other = (BookmarkPK) object;
        if (this.customerID != other.customerID) {
            return false;
        }
        if (this.productID != other.productID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.BookmarkPK[ customerID=" + customerID + ", productID=" + productID + " ]";
    }
    
}
