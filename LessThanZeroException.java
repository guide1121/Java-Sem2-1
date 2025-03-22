public class LessThanZeroException extends Exception{
    private double amount;
    LessThanZeroException(String messege){
        super(messege);
    }
    LessThanZeroException(double amount){
        super("Your amount is less than zero: ");
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
