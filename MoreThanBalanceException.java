//Name: Naphat Phoruang
//ID: 6787021
//Section: 1

public class MoreThanBalanceException extends Exception{
    private double amount;
    MoreThanBalanceException(String messege){
        super(messege);
    }
    MoreThanBalanceException(double amount){
        super("Your amount is more than amount.");
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
