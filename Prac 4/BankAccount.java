package Pracs;

public class BankAccount {
    private long accountNo = 0;
    private double balance;
    private String accountHolder;
    OurDate dateOpened = new OurDate(1,1,1);
    OurDate todaysDate = new OurDate(1,1,1);
    
    BankAccount(long accNo, double bal, String accHol, OurDate dateOp){
        accountNo = accNo;
        balance = bal;
        accountHolder = accHol;
        dateOpened = dateOp;
    }

    public long getAccountNo(){
        return accountNo;
    }   
    
    public double getBalance(){
        return balance;
    }
    
    public String getAccountHolder(){
        return accountHolder;
    }
    
    public OurDate getDateOpened(){
        return dateOpened;
    }
    
    public void setAccountNo(long accNo){
        accountNo = accNo;
    }
    
    public void setBalance(double bal){
        balance = bal;
    }
    
    public void setDateOpened(OurDate date){
        dateOpened = date;
    }
    
    public void deposit(double amnt){
        balance += amnt;
    }
    
    public void withdraw(double amnt){
        if (balance == 0){
            System.out.println("Bankrupt");
        }else{
        balance -= amnt;}
    }
    
    public void transfer(double amnt, BankAccount acc){
        this.withdraw(amnt);
        acc.deposit(amnt);
    }
    
    
    public String toString(){
        return "Name: " +accountHolder + " Balance: " + balance ;
    }
}
