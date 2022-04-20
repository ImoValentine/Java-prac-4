package Pracs;

public class OurDate {
    int dayOfMonth;
    int month;
    int year;
    int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    
     OurDate(int yr, int mnth, int dom){
        dayOfMonth = dom;
        month = mnth;
        year = yr;
    }
    
    public void setDate(OurDate date){
        dayOfMonth = date.dayOfMonth;
        month = date.month;
        year = date.year;
    }
    
    public int numberOfDaysBetween(OurDate otherDate){
        int dayEndMonth = 0, dayBetMonth = 0, dayEndYear = 0, tempyr = 0, dayWholeYear = 0, startToDay = 0, days = 0;;
        if (otherDate.year > year){ 
            if (tempyr % 4 == 0){
                    daysInMonth[1] = 29;   
                }else{
                    daysInMonth[1] = 28;
                }
            dayEndMonth = daysInMonth[month - 1] - dayOfMonth;
                    for (int i = month; i < daysInMonth.length; i++){
                        dayBetMonth = dayBetMonth + daysInMonth[i];
                    }dayEndYear = dayBetMonth + dayEndMonth;
                    
                    
        if (otherDate.year > year + 1){
            tempyr = year;
            while (otherDate.year > tempyr + 1){
                if (tempyr % 4 == 0){
                    daysInMonth[1] = 29;   
                }else{
                    daysInMonth[1] = 28;
                }
                for (int i = 0; i < daysInMonth.length; i++){
                    dayWholeYear = dayWholeYear + daysInMonth[i];
                }
                tempyr++;
            }
        }
            if (otherDate.year % 4 == 0){
                otherDate.daysInMonth[1] = 29;
            }else{
                otherDate.daysInMonth[1] = 28;
            }
            for (int i = 0; i < otherDate.month - 1; i++){
                startToDay = startToDay + otherDate.daysInMonth[i];
            }
            startToDay = startToDay + otherDate.dayOfMonth;
            days = startToDay + dayWholeYear + dayEndYear;
            
            
        }else if(year == otherDate.year){
            if (year % 4 == 0){
                    daysInMonth[1] = 29;   
                }if (otherDate.year % 4 == 0){
                    otherDate.daysInMonth[1] = 29;   
                }
            if (otherDate.month == month){
                days = otherDate.dayOfMonth - dayOfMonth;
            }else{
                days = daysInMonth[month - 1] - dayOfMonth;
                for (int i = month; i < otherDate.month - 1; i++){
                    days = days + daysInMonth[i];
                }days = days + otherDate.dayOfMonth;
            }
            
        }
        return days;
    } 
    public String toString(){
        return year + "/" + month + "/" + dayOfMonth;
    }
}
