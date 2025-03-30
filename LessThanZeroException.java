//Name: Naphat Phoruang
//ID: 6787021
//Section: 1

public class LessThanZeroException extends Exception{
    private double amount;
    LessThanZeroException(String messege){ 
        super(messege);
    }
    LessThanZeroException(double amount){
        super("Your amount is less than zero.");
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
