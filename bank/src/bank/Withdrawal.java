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
public class Withdrawal {
    
    private int Amount;
    private int AccountNumber;
    private int ATMCode;
    private int WithdrawalID;

    /**
     * @return the Amount
     */
    
    public Withdrawal(){
        
    }
    
    public Withdrawal(int Amount, int AccountNumber, int ATMCode, int WithdrawalID){
        this.Amount = Amount;
        this.AccountNumber = AccountNumber;
        this.ATMCode = ATMCode;
        this.WithdrawalID = WithdrawalID;
        
    }
    
    public int getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    /**
     * @return the AccountNumber
     */
    public int getAccountNumber() {
        return AccountNumber;
    }

    /**
     * @param AccountNumber the AccountNumber to set
     */
    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    /**
     * @return the ATMCode
     */
    public int getATMCode() {
        return ATMCode;
    }

    /**
     * @param ATMCode the ATMCode to set
     */
    public void setATMCode(int ATMCode) {
        this.ATMCode = ATMCode;
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
