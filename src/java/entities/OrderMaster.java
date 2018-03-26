/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author htp06
 */
@Entity
@Table(name = "OrderMaster", catalog = "ProjectTest", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderMaster.findAll", query = "SELECT o FROM OrderMaster o"),
    @NamedQuery(name = "OrderMaster.findByOrderID", query = "SELECT o FROM OrderMaster o WHERE o.orderID = :orderID"),
    @NamedQuery(name = "OrderMaster.findByDateCreated", query = "SELECT o FROM OrderMaster o WHERE o.dateCreated = :dateCreated"),
    @NamedQuery(name = "OrderMaster.findByDateShipped", query = "SELECT o FROM OrderMaster o WHERE o.dateShipped = :dateShipped"),
    @NamedQuery(name = "OrderMaster.findByShipType", query = "SELECT o FROM OrderMaster o WHERE o.shipType = :shipType"),
    @NamedQuery(name = "OrderMaster.findByShipFee", query = "SELECT o FROM OrderMaster o WHERE o.shipFee = :shipFee"),
    @NamedQuery(name = "OrderMaster.findByShipName", query = "SELECT o FROM OrderMaster o WHERE o.shipName = :shipName"),
    @NamedQuery(name = "OrderMaster.findByShipAddress", query = "SELECT o FROM OrderMaster o WHERE o.shipAddress = :shipAddress"),
    @NamedQuery(name = "OrderMaster.findByOrderStatus", query = "SELECT o FROM OrderMaster o WHERE o.orderStatus = :orderStatus")})
public class OrderMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID", nullable = false)
    private Integer orderID;
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "DateShipped")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateShipped;
    @Column(name = "ShipType")
    private Integer shipType;
    @Column(name = "ShipFee")
    private Integer shipFee;
    @Size(max = 50)
    @Column(name = "ShipName", length = 50)
    private String shipName;
    @Size(max = 100)
    @Column(name = "ShipAddress", length = 100)
    private String shipAddress;
    @Column(name = "OrderStatus")
    private Integer orderStatus;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")
    @ManyToOne
    private Customer customerID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderMaster")
    private Collection<OrderDetail> orderDetailCollection;

    public OrderMaster() {
    }

    public OrderMaster(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public Integer getShipType() {
        return shipType;
    }

    public void setShipType(Integer shipType) {
        this.shipType = shipType;
    }

    public Integer getShipFee() {
        return shipFee;
    }

    public void setShipFee(Integer shipFee) {
        this.shipFee = shipFee;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    @XmlTransient
    public Collection<OrderDetail> getOrderDetailCollection() {
        return orderDetailCollection;
    }

    public void setOrderDetailCollection(Collection<OrderDetail> orderDetailCollection) {
        this.orderDetailCollection = orderDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderMaster)) {
            return false;
        }
        OrderMaster other = (OrderMaster) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OrderMaster[ orderID=" + orderID + " ]";
    }
    
}
