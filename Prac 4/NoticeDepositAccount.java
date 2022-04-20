package Pracs;


public class NoticeDepositAccount extends SavingsAccount {
        int NoticePeriod;
        double balanceN;
        OurDate todaysDateN;
        OurDate dateOpenedN;
        String accHolderN;
    
    NoticeDepositAccount(int notPer, double intRateN, long accNoN, double balN, String accHolN, OurDate dateOpN){
        super( intRateN,  accNoN,  balN,  accHolN,  dateOpN);
        balanceN = balN;
        NoticePeriod = notPer;
        dateOpenedN = dateOpN;
        accHolderN = accHolN;
    }
    
    public int getNoticePeriod(){
       return NoticePeriod; 
    }
    
    public void setNoticePeriod(int period){
        NoticePeriod = period;
    }
    
    @Override
    public void withdraw(double amnt){
        addInterest(todaysDateN);
        if (dateOpenedN.numberOfDaysBetween(todaysDateN) < getNoticePeriod()){
            balanceN -= 250;
        }
        balanceN -= amnt;  
        setDateLastInterestAdded(todaysDateN);
    }
    
    @Override
    public void deposit(double amnt){
        //System.out.println(balanceN);
        addInterest(todaysDateN);
        //System.out.println(balanceN);
        balanceN += amnt;
        setDateLastInterestAdded(todaysDateN);
    }
    
    @Override
    public void addInterest(OurDate date){
        int numDays = getDateLastInterestAdded().numberOfDaysBetween(date);
        double balanceTemp = balanceN;
        balanceN = balanceN * numDays * (interestRate/365);
        interestAccrued = interestAccrued + (balanceN - balanceTemp);
    }
    
    
    public String toString(){
        return  String.format("%s, Balance: %s\n",accHolderN, balanceN);
    }
}
