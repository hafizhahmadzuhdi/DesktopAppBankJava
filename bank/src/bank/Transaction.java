/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author HafizhAhmadZuhdi
 */
public class Transaction {
    
    private int TransactionID;
    private String Date;
    private String Time;
    private int WithdrawalID;

    public Transaction(){
        
    }
    
    public Transaction(int TransactionID, String Date, String Time, int WithdrawalID){//CREATE TRANSACTION made in here
        this.TransactionID = TransactionID;
        this.Date = Date;
        this.Time = Time;
        this.WithdrawalID = WithdrawalID;
    }
    
    /**
     * @return the TransactionID
     */
    
    public int getTransactionID() {
        return TransactionID;
    }

    /**
     * @param TransactionID the TransactionID to set
     */
    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * @return the WithdrawalID
     */
    public int getWithdrawalID() {
        return WithdrawalID;
    }

    /**
     * @param WithdrawalID the WithdrawalID to set
     */
    public void setWithdrawalID(int WithdrawalID) {
        this.WithdrawalID = WithdrawalID;
    }
    
    
    
}
