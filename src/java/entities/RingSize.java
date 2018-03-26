/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author htp06
 */
@Entity
@Table(name = "RingSize", catalog = "ProjectTest", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RingSize.findAll", query = "SELECT r FROM RingSize r"),
    @NamedQuery(name = "RingSize.findByRingSizeID", query = "SELECT r FROM RingSize r WHERE r.ringSizeID = :ringSizeID"),
    @NamedQuery(name = "RingSize.findByRingSizeValue", query = "SELECT r FROM RingSize r WHERE r.ringSizeValue = :ringSizeValue"),
    @NamedQuery(name = "RingSize.findByPriceModifier", query = "SELECT r FROM RingSize r WHERE r.priceModifier = :priceModifier")})
public class RingSize implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RingSizeID", nullable = false)
    private Integer ringSizeID;
    @Size(max = 3)
    @Column(name = "RingSizeValue", length = 3)
    private String ringSizeValue;
    @Column(name = "PriceModifier")
    private Integer priceModifier;
    @ManyToMany(mappedBy = "ringSizeCollection")
    private Collection<Product> productCollection;

    public RingSize() {
    }

    public RingSize(Integer ringSizeID) {
        this.ringSizeID = ringSizeID;
    }

    public Integer getRingSizeID() {
        return ringSizeID;
    }

    public void setRingSizeID(Integer ringSizeID) {
        this.ringSizeID = ringSizeID;
    }

    public String getRingSizeValue() {
        return ringSizeValue;
    }

    public void setRingSizeValue(String ringSizeValue) {
        this.ringSizeValue = ringSizeValue;
    }

    public Integer getPriceModifier() {
        return priceModifier;
    }

    public void setPriceModifier(Integer priceModifier) {
        this.priceModifier = priceModifier;
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
        hash += (ringSizeID != null ? ringSizeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RingSize)) {
            return false;
        }
        RingSize other = (RingSize) object;
        if ((this.ringSizeID == null && other.ringSizeID != null) || (this.ringSizeID != null && !this.ringSizeID.equals(other.ringSizeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RingSize[ ringSizeID=" + ringSizeID + " ]";
    }
    
}
