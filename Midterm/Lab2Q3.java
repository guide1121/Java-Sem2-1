package Midterm;
//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
import java.util.*;
public class Lab2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        if(price<50){
            System.out.println(price);
        }
        else if(price<100){
            System.out.println(price-(price*0.05));
        }
        else if(price<1000){
            System.out.println(price-(price*0.1));
        }
        else if(price>1000){
            System.out.println(price-(price*0.2));
        }
    }
}

