package Pracs;

public class SavingsAccount extends BankAccount{
    String accHolderS;
     double balanceS;
    double interestRate;
    double interestAccrued;
    OurDate intLast;
    OurDate todaysDateS;
    OurDate dateOpenedS;
        
    SavingsAccount(double intRate, long accNoS, double balS, String accHolS, OurDate dateOpS){
        super(accNoS, balS, accHolS, dateOpS);   
        interestRate = intRate;
        balanceS = balS;
        accHolderS = accHolS;
        dateOpenedS = dateOpS;
    }
    
    public double getInterestRate(){
        return interestRate;
    }
    public OurDate getDateLastInterestAdded(){
        return intLast;
    }
    
    public double getInterestAccrued(){
        return interestAccrued;
    }
    
    public void setInterestRate(double intRate){
        interestRate = intRate;
    }
    
    public void setDateLastInterestAdded(OurDate Date){
        intLast = Date;
    }
    
    public void setInterestAccrued(double intAccr){
        interestAccrued = intAccr;
    }
    
    @Override
    public void deposit(double amnt){
        addInterest(todaysDateS);
        //System.out.println(todaysDateS);
        balanceS += amnt;
        setDateLastInterestAdded(todaysDateS);
    }
    
    @Override
    public void withdraw(double amnt){
        if (balanceS == 0){
            System.out.println("Bankrupt");
        }else{
        addInterest(todaysDateS);
        //System.out.println("Balance before: " + balanceS);
        setDateLastInterestAdded(todaysDateS);
        balanceS -= amnt;
        
        //System.out.println("Balance after: " + balanceS);
        }
    }
    
    public void addInterest(OurDate date){
        int numDays = getDateLastInterestAdded().numberOfDaysBetween(date);
        double balanceTemp = balanceS;
        balanceS = balanceS * numDays * (interestRate/365);
        interestAccrued = interestAccrued + (balanceS - balanceTemp);
    }
    
    public String toString(){
        return  String.format("%s, Balance: %s\n",accHolderS, balanceS);
    }
    
}
