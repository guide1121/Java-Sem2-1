package Midterm;
//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
public class TimeProduct extends Product{
    private int startTime;
    private int endTime;
    public TimeProduct(String name, double price, int startTime, int endTime){
        super(name, price);
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public int getStartTime() {
        return this.startTime;
    }
    public int getEndTime() {
        return this.endTime;
    }

    public boolean isInTime(int time){
        if(time > startTime && time < endTime){
            return true;
        }else{
            return false;
        }

    }
}
