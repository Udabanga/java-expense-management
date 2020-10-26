/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensemanagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author udaya
 */
@Entity
@Table(name = "expense", catalog = "pe", schema = "")
@NamedQueries({
    @NamedQuery(name = "Expense_1.findAll", query = "SELECT e FROM Expense_1 e")
    , @NamedQuery(name = "Expense_1.findById", query = "SELECT e FROM Expense_1 e WHERE e.id = :id")
    , @NamedQuery(name = "Expense_1.findByTDetails", query = "SELECT e FROM Expense_1 e WHERE e.tDetails = :tDetails")
    , @NamedQuery(name = "Expense_1.findByDate", query = "SELECT e FROM Expense_1 e WHERE e.date = :date")
    , @NamedQuery(name = "Expense_1.findByAmount", query = "SELECT e FROM Expense_1 e WHERE e.amount = :amount")})
public class Expense_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tDetails")
    private String tDetails;
    @Basic(optional = false)
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "Amount")
    private double amount;

    public Expense_1() {
    }

    public Expense_1(Integer id) {
        this.id = id;
    }

    public Expense_1(Integer id, String tDetails, Date date, double amount) {
        this.id = id;
        this.tDetails = tDetails;
        this.date = date;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTDetails() {
        return tDetails;
    }

    public void setTDetails(String tDetails) {
        String oldTDetails = this.tDetails;
        this.tDetails = tDetails;
        changeSupport.firePropertyChange("TDetails", oldTDetails, tDetails);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        double oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expense_1)) {
            return false;
        }
        Expense_1 other = (Expense_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "expensemanagement.Expense_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
