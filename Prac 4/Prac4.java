package Pracs;
import java.util.Scanner;
public class Prac4 {
    
    
    public void run(){
        /*Worker workerArray[] = new Worker[2]; 
        workerArray[0] = new HourlyWorker("Bob", 10);
        workerArray[1] = new SalariedWorker("Tom", 5);
        for (int i = 0; i < workerArray.length; i++){
            workerArray[i].computePay(10);
        }
        OurDate object1 = new OurDate(13,2,2012);
        OurDate object2 = new OurDate(2,7,2012);
        object1.numberOfDaysBetween(object2);*/
        

        /*OurDate accOpened1 = new OurDate(1,2,3);
        OurDate accOpened2 = new OurDate(1,1,1);
        BankAccount person1 = new BankAccount(1, 1000, "Bob", accOpened1);
        person1.todaysDate.setDate(new OurDate(4,5,6));
        BankAccount person2 = new BankAccount(2, 500, "Tom", accOpened2);
        person2.todaysDate.setDate(new OurDate(2,2,3));
        System.out.println(person1.todaysDate.dayOfMonth);
        System.out.println(person2.todaysDate.dayOfMonth);*/
        
        OurDate2 object1 = new OurDate2(2011,12,31);
        System.out.println(object1.numberOfDaysBetween(2012,1,3));
        
    }
    
    public static void main(String[] args){
        Prac4 newObject = new Prac4();
        newObject.run();
        
    }
    
}
