//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
import java.util.*;
public class Lab2Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //weight
        double std1_w = sc.nextDouble();
        double std2_w = sc.nextDouble();
        double std3_w = sc.nextDouble();
        double std4_w = sc.nextDouble();

        double std1_h = sc.nextDouble();
        double std2_h = sc.nextDouble();
        double std3_h = sc.nextDouble();
        double std4_h = sc.nextDouble();

        System.out.println("The average weight is " + ((std1_w + std2_w + std3_w + std4_w)/4));
        System.out.println("The average height is " + ((std1_h + std2_h + std3_h + std4_h)/4));

    }
}