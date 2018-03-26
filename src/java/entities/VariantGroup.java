/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author htp06
 */
@Entity
@Table(name = "VariantGroup", catalog = "ProjectTest", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"VariantGroupName"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariantGroup.findAll", query = "SELECT v FROM VariantGroup v"),
    @NamedQuery(name = "VariantGroup.findByVariantGroupID", query = "SELECT v FROM VariantGroup v WHERE v.variantGroupID = :variantGroupID"),
    @NamedQuery(name = "VariantGroup.findByVariantGroupName", query = "SELECT v FROM VariantGroup v WHERE v.variantGroupName = :variantGroupName")})
public class VariantGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VariantGroupID", nullable = false)
    private Integer variantGroupID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "VariantGroupName", nullable = false, length = 100)
    private String variantGroupName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "variantGroupID")
    private Collection<Variant> variantCollection;

    public VariantGroup() {
    }

    public VariantGroup(Integer variantGroupID) {
        this.variantGroupID = variantGroupID;
    }

    public VariantGroup(Integer variantGroupID, String variantGroupName) {
        this.variantGroupID = variantGroupID;
        this.variantGroupName = variantGroupName;
    }

    public Integer getVariantGroupID() {
        return variantGroupID;
    }

    public void setVariantGroupID(Integer variantGroupID) {
        this.variantGroupID = variantGroupID;
    }

    public String getVariantGroupName() {
        return variantGroupName;
    }

    public void setVariantGroupName(String variantGroupName) {
        this.variantGroupName = variantGroupName;
    }

    @XmlTransient
    public Collection<Variant> getVariantCollection() {
        return variantCollection;
    }

    public void setVariantCollection(Collection<Variant> variantCollection) {
        this.variantCollection = variantCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variantGroupID != null ? variantGroupID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariantGroup)) {
            return false;
        }
        VariantGroup other = (VariantGroup) object;
        if ((this.variantGroupID == null && other.variantGroupID != null) || (this.variantGroupID != null && !this.variantGroupID.equals(other.variantGroupID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.VariantGroup[ variantGroupID=" + variantGroupID + " ]";
    }
    
}
