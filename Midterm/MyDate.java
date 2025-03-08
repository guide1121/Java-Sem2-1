package Midterm;
//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
public class MyDate {
    private int year;
    private int month;
    private int day;
    private int objectNumber;

    static private int objectCounter;
    static private String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "June","July", "Aug", "Sep", "Oct", "Nov","Dec"};

    public MyDate(int aYear, int aMonth, int aDay){
        objectCounter ++;
        this.objectNumber = objectCounter;
        this.year = aYear;
        this.month = aMonth;
        this.day = aDay;
        
    }
    public MyDate(){
        objectCounter ++;
        this.objectNumber = objectCounter;
        this.year = 1990;
        this.month = 1;
        this.day = 1;
    }

    public static boolean isLeapYear(int year){
        if(year % 4 != 0){
            return false;
        }
        else if(year % 4 == 0 && year % 100 != 0){
            return true;
        }
        else if(year % 100 == 0 && year % 400 != 0){
            return false;
        }
        else if(year % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int getObjectNumber(){
        return this.objectNumber;
    }

    public void setDate(int aYear, int aMonth, int aDay){
        this.year = aYear;
        this.month = aMonth;
        this.day = aDay;
    }
    public void setDay(int aDay){
        this.day = aDay;
    }
    public void setMonth(int aMonth){
        this.month = aMonth;
    }
    public void setYear(int aYear){
        this.year = aYear;
    }

    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }

    public String toString(){
        if(this.day >= 10){
            return this.day + " " + strMonths[this.month-1] + " " + this.year;
        }
        else{
            return "0"+this.day + " " + strMonths[this.month-1] + " " + this.year;
        }
        
    }

    public MyDate nextDay(){
        if(this.month == 12 && day == 31){
            this.year = this.year + 1;
            this.month = 1;
            this.day = 1;
        }
        else{
            if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
                if(this.day == 30){
                    this.month =  this.month + 1;
                    this.day = 1;
                }else{
                    this.day = this.day+1;
                }
            }
            else if(this.month != 2){
                if(this.day == 31){
                    this.month =  this.month + 1;
                    this.day = 1;
                }else{
                    this.day = this.day+1;
                }
            }else{
                if(isLeapYear(this.year) && this.day == 29){
                    this.month =  this.month + 1;
                    this.day = 1;
                }else if(!isLeapYear(this.year) && this.year == 28){
                    this.month =  this.month + 1;
                    this.day = 1;
                }else{
                    this.day = this.day+1;
                }
            }
        }
        return this;
    }
    public MyDate nextMonth(){
        if(this.month == 12){
            this.year = this.year + 1;
            this.month = 1;
            this.day = 1;
        }
        else if((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12 ) && this.day == 31){
            this.month = this.month+2;
            this.day = 1;
        }
        else{
            this.month = this.month + 1;
        }
        return this;
    }
    public MyDate nextYear(){
        if(this.month == 2 && this.day == 29){
            this.year = this.year + 1;
            this.day = 28;
        }
        else{
            this.year = this.year + 1;
        }
        return this;
    }

    public MyDate previousDay(){
        if(this.month == 1 && this.day ==1){
            this.year = this.year -1;
            this.month = 12;
            this.day = 31;
        }else{
            if(this.month == 5 || this.month == 7 || this.month == 10 ||this.month == 12){
                if(this.day == 1){
                    this.month = this.month -1;
                    this.day = 30;
                }else{
                    this.day = this.day-1;
                }
            }else if(month != 3){
                if(this.day == 1){
                    this.month = this.month -1;
                    this.day = 31;
                }else{
                    this.day = this.day-1;
                }
            }else{
                if(isLeapYear(this.year) && this.day == 1){
                    this.month = this.month -1;
                    this.day = 29;
                }else if(this.day == 1){
                    this.month = this.month -1;
                    this.day = 28;
                }else{
                    this.day = this.day -1;
                }
            }
        }
        return this;
    }
    public MyDate previousMonth(){
        if(this.month == 1){
            this.year = this.year -1;
        }else if((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12 ) && this.day == 31){
            this.month = this.month - 1;
            this.day = 30;
        }
        else{
            this.month = this.month-1;
        }
        return this;
    }
    public MyDate previousYear(){
        if(this.month == 2 && this.day == 29){
            this.year = this.year - 1;
            this.day = 28;
        }
        else{
            this.year = this.year - 1; 
        }
        return this;
    }
}
