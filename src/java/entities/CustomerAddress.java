/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author htp06
 */
@Entity
@Table(name = "CustomerAddress", catalog = "ProjectTest", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerAddress.findAll", query = "SELECT c FROM CustomerAddress c"),
    @NamedQuery(name = "CustomerAddress.findByAddressID", query = "SELECT c FROM CustomerAddress c WHERE c.addressID = :addressID"),
    @NamedQuery(name = "CustomerAddress.findByNumber", query = "SELECT c FROM CustomerAddress c WHERE c.number = :number"),
    @NamedQuery(name = "CustomerAddress.findByStreet", query = "SELECT c FROM CustomerAddress c WHERE c.street = :street"),
    @NamedQuery(name = "CustomerAddress.findByWard", query = "SELECT c FROM CustomerAddress c WHERE c.ward = :ward"),
    @NamedQuery(name = "CustomerAddress.findByDistrict", query = "SELECT c FROM CustomerAddress c WHERE c.district = :district"),
    @NamedQuery(name = "CustomerAddress.findByCity", query = "SELECT c FROM CustomerAddress c WHERE c.city = :city")})
public class CustomerAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AddressID", nullable = false)
    private Integer addressID;
    @Size(max = 10)
    @Column(name = "Number", length = 10)
    private String number;
    @Size(max = 100)
    @Column(name = "Street", length = 100)
    private String street;
    @Size(max = 20)
    @Column(name = "Ward", length = 20)
    private String ward;
    @Size(max = 20)
    @Column(name = "District", length = 20)
    private String district;
    @Size(max = 20)
    @Column(name = "City", length = 20)
    private String city;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", nullable = false)
    @ManyToOne(optional = false)
    private Customer customerID;

    public CustomerAddress() {
    }

    public CustomerAddress(Integer addressID) {
        this.addressID = addressID;
    }

    public Integer getAddressID() {
        return addressID;
    }

    public void setAddressID(Integer addressID) {
        this.addressID = addressID;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressID != null ? addressID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerAddress)) {
            return false;
        }
        CustomerAddress other = (CustomerAddress) object;
        if ((this.addressID == null && other.addressID != null) || (this.addressID != null && !this.addressID.equals(other.addressID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CustomerAddress[ addressID=" + addressID + " ]";
    }
    
}
