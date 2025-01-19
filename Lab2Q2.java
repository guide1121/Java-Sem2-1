//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
import java.util.*;
public class Lab2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int ten = money/10;
        int five = (money - ten*10) / 5;
        int one = money - (ten*10) - (five*5);
        System.out.println("10: "+ ten);
        System.out.println("5: " +five);
        System.out.println("1: "+ one);
    }
}
