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
import javax.persistence.Lob;
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
@Table(name = "ProductCol", catalog = "ProjectTest", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ColName"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductCol.findAll", query = "SELECT p FROM ProductCol p"),
    @NamedQuery(name = "ProductCol.findByColID", query = "SELECT p FROM ProductCol p WHERE p.colID = :colID"),
    @NamedQuery(name = "ProductCol.findByColName", query = "SELECT p FROM ProductCol p WHERE p.colName = :colName"),
    @NamedQuery(name = "ProductCol.findByColImage", query = "SELECT p FROM ProductCol p WHERE p.colImage = :colImage")})
public class ProductCol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ColID", nullable = false)
    private Integer colID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ColName", nullable = false, length = 100)
    private String colName;
    @Size(max = 300)
    @Column(name = "ColImage", length = 300)
    private String colImage;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "ColDesc", nullable = false, length = 2147483647)
    private String colDesc;
    @OneToMany(mappedBy = "colID")
    private Collection<Product> productCollection;

    public ProductCol() {
    }

    public ProductCol(Integer colID) {
        this.colID = colID;
    }

    public ProductCol(Integer colID, String colName, String colDesc) {
        this.colID = colID;
        this.colName = colName;
        this.colDesc = colDesc;
    }

    public Integer getColID() {
        return colID;
    }

    public void setColID(Integer colID) {
        this.colID = colID;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getColImage() {
        return colImage;
    }

    public void setColImage(String colImage) {
        this.colImage = colImage;
    }

    public String getColDesc() {
        return colDesc;
    }

    public void setColDesc(String colDesc) {
        this.colDesc = colDesc;
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
        hash += (colID != null ? colID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCol)) {
            return false;
        }
        ProductCol other = (ProductCol) object;
        if ((this.colID == null && other.colID != null) || (this.colID != null && !this.colID.equals(other.colID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProductCol[ colID=" + colID + " ]";
    }
    
}
