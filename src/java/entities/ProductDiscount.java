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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "ProductDiscount", catalog = "ProjectTest", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductDiscount.findAll", query = "SELECT p FROM ProductDiscount p"),
    @NamedQuery(name = "ProductDiscount.findByDiscountID", query = "SELECT p FROM ProductDiscount p WHERE p.discountID = :discountID"),
    @NamedQuery(name = "ProductDiscount.findByDiscountName", query = "SELECT p FROM ProductDiscount p WHERE p.discountName = :discountName"),
    @NamedQuery(name = "ProductDiscount.findByDiscountValue", query = "SELECT p FROM ProductDiscount p WHERE p.discountValue = :discountValue"),
    @NamedQuery(name = "ProductDiscount.findByDateCreated", query = "SELECT p FROM ProductDiscount p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "ProductDiscount.findByDateUpdated", query = "SELECT p FROM ProductDiscount p WHERE p.dateUpdated = :dateUpdated"),
    @NamedQuery(name = "ProductDiscount.findByValidFrom", query = "SELECT p FROM ProductDiscount p WHERE p.validFrom = :validFrom"),
    @NamedQuery(name = "ProductDiscount.findByValidTo", query = "SELECT p FROM ProductDiscount p WHERE p.validTo = :validTo")})
public class ProductDiscount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DiscountID", nullable = false)
    private Integer discountID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DiscountName", nullable = false, length = 50)
    private String discountName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DiscountValue", nullable = false)
    private int discountValue;
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "DateUpdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ValidFrom", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date validFrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ValidTo", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date validTo;
    @OneToMany(mappedBy = "discountID")
    private Collection<Product> productCollection;

    public ProductDiscount() {
    }

    public ProductDiscount(Integer discountID) {
        this.discountID = discountID;
    }

    public ProductDiscount(Integer discountID, String discountName, int discountValue, Date validFrom, Date validTo) {
        this.discountID = discountID;
        this.discountName = discountName;
        this.discountValue = discountValue;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public Integer getDiscountID() {
        return discountID;
    }

    public void setDiscountID(Integer discountID) {
        this.discountID = discountID;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public int getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(int discountValue) {
        this.discountValue = discountValue;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (discountID != null ? discountID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductDiscount)) {
            return false;
        }
        ProductDiscount other = (ProductDiscount) object;
        if ((this.discountID == null && other.discountID != null) || (this.discountID != null && !this.discountID.equals(other.discountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProductDiscount[ discountID=" + discountID + " ]";
    }
    
}
