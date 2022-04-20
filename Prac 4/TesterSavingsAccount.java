package Pracs;

public class TesterSavingsAccount 
{
	public static void main (String[] args)
	{       BankAccount b1 = new BankAccount(1,1, "Bob", new OurDate(1,1,1));
		SavingsAccount b2 = new SavingsAccount(6.5, 246890, 500.0, "Benjamin", new OurDate(2010, 10, 25));
                b2.setDateLastInterestAdded(b2.dateOpenedS);
                b2.setInterestAccrued(0);
		System.out.println(b2);			
		SavingsAccount b3 = new SavingsAccount(10.0, 468901, 7500.0, "Conradie", new OurDate(2011, 8, 16));
                b3.setDateLastInterestAdded(b3.dateOpenedS);
                b2.setInterestAccrued(0);
		System.out.println(b3);	
                
                System.out.println

		b1.todaysDate.setDate(new OurDate(2011, 9, 29)); // setOurDate when transaction is performed
                b3.todaysDateS = (new OurDate(2011, 9, 29));
		System.out.println("Withdraw R800 on "+b1.todaysDate+". Interest last added on "+b3.getDateLastInterestAdded()+", Period: "+ b3.getDateLastInterestAdded().numberOfDaysBetween(b1.todaysDate)+" days");
                System.out.println(" ");
		b3.withdraw(800);
                System.out.println(b3);
                System.out.println("Interest Accrued: " + b3.getInterestAccrued());
		System.out.println();

                System.out.println

		b1.todaysDate.setDate(new OurDate(2012, 1, 15));
                b3.todaysDateS = new OurDate(2012, 1, 15);
		System.out.println("Deposit R500 "+b1.todaysDate+". Interest last added on, "+b3.getDateLastInterestAdded()+" period: "+ b3.getDateLastInterestAdded().numberOfDaysBetween(b1.todaysDate)+" days");
		b3.deposit(500);
                System.out.println(" ");
		System.out.println(b3);
                System.out.println("Interest Accrued: " + b3.getInterestAccrued());
                
                System.out.println

		b1.todaysDate.setDate(new OurDate(2012, 3, 10));
                b2.todaysDateS = (new OurDate(2012, 3, 10));
                b3.todaysDateS = new OurDate(2012, 3, 10);
		System.out.println("Before transfer ");
		System.out.println(b3);	
                System.out.println(b2);	

		System.out.println("Transfer R200 "+b1.todaysDate+". Interest last added on, "+b3.getDateLastInterestAdded()+" period: "+ b3.getDateLastInterestAdded().numberOfDaysBetween(b1.todaysDate)+" days");
                System.out.println(" ");
		System.out.println("Transfer R200 "+b1.todaysDate+". Interest last added on, "+b2.getDateLastInterestAdded()+" period: "+ b2.getDateLastInterestAdded().numberOfDaysBetween(b1.todaysDate)+" days");
		          System.out.println(" ");
                b3.transfer(200, b2);
		System.out.println("After transfer ");
		System.out.println(b3 + "Interest accrued: " + b3.interestAccrued);	
                System.out.println(" ");
		System.out.println(b2 + "Interest accrued: " + b2.interestAccrued);	
		System.out.println();		
	}
}
