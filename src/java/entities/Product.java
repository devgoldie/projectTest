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
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "Product", catalog = "ProjectTest", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ProductName"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByProductID", query = "SELECT p FROM Product p WHERE p.productID = :productID"),
    @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName"),
    @NamedQuery(name = "Product.findByUnitsInStock", query = "SELECT p FROM Product p WHERE p.unitsInStock = :unitsInStock"),
    @NamedQuery(name = "Product.findByUnitsOnOrder", query = "SELECT p FROM Product p WHERE p.unitsOnOrder = :unitsOnOrder"),
    @NamedQuery(name = "Product.findByBasePrice", query = "SELECT p FROM Product p WHERE p.basePrice = :basePrice"),
    @NamedQuery(name = "Product.findByUnitPrice", query = "SELECT p FROM Product p WHERE p.unitPrice = :unitPrice"),
    @NamedQuery(name = "Product.findByDateCreated", query = "SELECT p FROM Product p WHERE p.dateCreated = :dateCreated"),
    @NamedQuery(name = "Product.findByDateUpdated", query = "SELECT p FROM Product p WHERE p.dateUpdated = :dateUpdated"),
    @NamedQuery(name = "Product.findByDiscontinued", query = "SELECT p FROM Product p WHERE p.discontinued = :discontinued")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID", nullable = false)
    private Integer productID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ProductName", nullable = false, length = 100)
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "ProductDesc", nullable = false, length = 2147483647)
    private String productDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitsInStock", nullable = false)
    private int unitsInStock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitsOnOrder", nullable = false)
    private int unitsOnOrder;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BasePrice", nullable = false)
    private int basePrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitPrice", nullable = false)
    private int unitPrice;
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "DateUpdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Discontinued", nullable = false)
    private boolean discontinued;
    @JoinTable(name = "ProductRingSize", joinColumns = {
        @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "RingSizeID", referencedColumnName = "RingSizeID", nullable = false)})
    @ManyToMany
    private Collection<RingSize> ringSizeCollection;
    @ManyToMany(mappedBy = "productCollection")
    private Collection<Category> categoryCollection;
    @JoinTable(name = "ProductVariant", joinColumns = {
        @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "VariantID", referencedColumnName = "VariantID", nullable = false)})
    @ManyToMany
    private Collection<Variant> variantCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<ProductImage> productImageCollection;
    @JoinColumn(name = "ColID", referencedColumnName = "ColID")
    @ManyToOne
    private ProductCol colID;
    @JoinColumn(name = "DiscountID", referencedColumnName = "DiscountID")
    @ManyToOne
    private ProductDiscount discountID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private Collection<Review> reviewCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private Collection<OrderDetail> orderDetailCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private Collection<Bookmark> bookmarkCollection;

    public Product() {
    }

    public Product(Integer productID) {
        this.productID = productID;
    }

    public Product(Integer productID, String productName, String productDesc, int unitsInStock, int unitsOnOrder, int basePrice, int unitPrice, boolean discontinued) {
        this.productID = productID;
        this.productName = productName;
        this.productDesc = productDesc;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.basePrice = basePrice;
        this.unitPrice = unitPrice;
        this.discontinued = discontinued;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(int unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
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

    public boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    @XmlTransient
    public Collection<RingSize> getRingSizeCollection() {
        return ringSizeCollection;
    }

    public void setRingSizeCollection(Collection<RingSize> ringSizeCollection) {
        this.ringSizeCollection = ringSizeCollection;
    }

    @XmlTransient
    public Collection<Category> getCategoryCollection() {
        return categoryCollection;
    }

    public void setCategoryCollection(Collection<Category> categoryCollection) {
        this.categoryCollection = categoryCollection;
    }

    @XmlTransient
    public Collection<Variant> getVariantCollection() {
        return variantCollection;
    }

    public void setVariantCollection(Collection<Variant> variantCollection) {
        this.variantCollection = variantCollection;
    }

    @XmlTransient
    public Collection<ProductImage> getProductImageCollection() {
        return productImageCollection;
    }

    public void setProductImageCollection(Collection<ProductImage> productImageCollection) {
        this.productImageCollection = productImageCollection;
    }

    public ProductCol getColID() {
        return colID;
    }

    public void setColID(ProductCol colID) {
        this.colID = colID;
    }

    public ProductDiscount getDiscountID() {
        return discountID;
    }

    public void setDiscountID(ProductDiscount discountID) {
        this.discountID = discountID;
    }

    @XmlTransient
    public Collection<Review> getReviewCollection() {
        return reviewCollection;
    }

    public void setReviewCollection(Collection<Review> reviewCollection) {
        this.reviewCollection = reviewCollection;
    }

    @XmlTransient
    public Collection<OrderDetail> getOrderDetailCollection() {
        return orderDetailCollection;
    }

    public void setOrderDetailCollection(Collection<OrderDetail> orderDetailCollection) {
        this.orderDetailCollection = orderDetailCollection;
    }

    @XmlTransient
    public Collection<Bookmark> getBookmarkCollection() {
        return bookmarkCollection;
    }

    public void setBookmarkCollection(Collection<Bookmark> bookmarkCollection) {
        this.bookmarkCollection = bookmarkCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Product[ productID=" + productID + " ]";
    }
    
}
