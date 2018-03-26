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
public class OrderDetailPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID", nullable = false)
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID", nullable = false)
    private int orderID;

    public OrderDetailPK() {
    }

    public OrderDetailPK(int productID, int orderID) {
        this.productID = productID;
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productID;
        hash += (int) orderID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetailPK)) {
            return false;
        }
        OrderDetailPK other = (OrderDetailPK) object;
        if (this.productID != other.productID) {
            return false;
        }
        if (this.orderID != other.orderID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OrderDetailPK[ productID=" + productID + ", orderID=" + orderID + " ]";
    }
    
}
