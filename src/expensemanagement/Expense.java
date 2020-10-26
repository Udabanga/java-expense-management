/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensemanagement;

import java.sql.Date;

/**
 *
 * @author udaya
 */
public class Expense {
    private int ID;
    private String tDetails;
    private Date date;
    private double amount;

    public Expense(int ID, String tDetails, Date date, double amount) {
        this.ID = ID;
        this.tDetails = tDetails;
        this.date = date;
        this.amount = amount;
    }

    public Expense(String tDetails, Date date, double amount) {
        this.tDetails = tDetails;
        this.date = date;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public String gettDetails() {
        return tDetails;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    
    
    
}
