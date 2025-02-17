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
}
