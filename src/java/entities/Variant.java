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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "Variant", catalog = "ProjectTest", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Variant.findAll", query = "SELECT v FROM Variant v"),
    @NamedQuery(name = "Variant.findByVariantID", query = "SELECT v FROM Variant v WHERE v.variantID = :variantID"),
    @NamedQuery(name = "Variant.findByVariantValue", query = "SELECT v FROM Variant v WHERE v.variantValue = :variantValue")})
public class Variant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VariantID", nullable = false)
    private Integer variantID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "VariantValue", nullable = false, length = 20)
    private String variantValue;
    @ManyToMany(mappedBy = "variantCollection")
    private Collection<Product> productCollection;
    @JoinColumn(name = "VariantGroupID", referencedColumnName = "VariantGroupID", nullable = false)
    @ManyToOne(optional = false)
    private VariantGroup variantGroupID;

    public Variant() {
    }

    public Variant(Integer variantID) {
        this.variantID = variantID;
    }

    public Variant(Integer variantID, String variantValue) {
        this.variantID = variantID;
        this.variantValue = variantValue;
    }

    public Integer getVariantID() {
        return variantID;
    }

    public void setVariantID(Integer variantID) {
        this.variantID = variantID;
    }

    public String getVariantValue() {
        return variantValue;
    }

    public void setVariantValue(String variantValue) {
        this.variantValue = variantValue;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    public VariantGroup getVariantGroupID() {
        return variantGroupID;
    }

    public void setVariantGroupID(VariantGroup variantGroupID) {
        this.variantGroupID = variantGroupID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variantID != null ? variantID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Variant)) {
            return false;
        }
        Variant other = (Variant) object;
        if ((this.variantID == null && other.variantID != null) || (this.variantID != null && !this.variantID.equals(other.variantID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Variant[ variantID=" + variantID + " ]";
    }
    
}
