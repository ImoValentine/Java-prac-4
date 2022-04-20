package Pracs;

public class SalariedWorker extends Worker {
    
    public SalariedWorker(String name, int salary){
        workerName = name;
        salaryRate = salary;
        System.out.println(workerName + ": Salaried worker, Salary rate: R" + salaryRate + " per hour");
    }
    @Override
    public void computePay(int hours){
        int pay = 0, excessTime = 0, excessPay = 0;
        if (hours <=40){
             pay = salaryRate * 40;
        }else{
            pay = salaryRate * 40;
            excessTime = (int) ((hours - 40) / 1.5);
            excessPay = salaryRate * excessTime;
            
        }
        int totalPay = pay + excessPay;
        System.out.println("Total pay is R" + totalPay );
    }
}
