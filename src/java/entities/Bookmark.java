/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author htp06
 */
@Entity
@Table(name = "Bookmark", catalog = "ProjectTest", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookmark.findAll", query = "SELECT b FROM Bookmark b"),
    @NamedQuery(name = "Bookmark.findByCustomerID", query = "SELECT b FROM Bookmark b WHERE b.bookmarkPK.customerID = :customerID"),
    @NamedQuery(name = "Bookmark.findByProductID", query = "SELECT b FROM Bookmark b WHERE b.bookmarkPK.productID = :productID"),
    @NamedQuery(name = "Bookmark.findByDateCreated", query = "SELECT b FROM Bookmark b WHERE b.dateCreated = :dateCreated")})
public class Bookmark implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BookmarkPK bookmarkPK;
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Customer customer;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public Bookmark() {
    }

    public Bookmark(BookmarkPK bookmarkPK) {
        this.bookmarkPK = bookmarkPK;
    }

    public Bookmark(int customerID, int productID) {
        this.bookmarkPK = new BookmarkPK(customerID, productID);
    }

    public BookmarkPK getBookmarkPK() {
        return bookmarkPK;
    }

    public void setBookmarkPK(BookmarkPK bookmarkPK) {
        this.bookmarkPK = bookmarkPK;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookmarkPK != null ? bookmarkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookmark)) {
            return false;
        }
        Bookmark other = (Bookmark) object;
        if ((this.bookmarkPK == null && other.bookmarkPK != null) || (this.bookmarkPK != null && !this.bookmarkPK.equals(other.bookmarkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bookmark[ bookmarkPK=" + bookmarkPK + " ]";
    }
    
}
