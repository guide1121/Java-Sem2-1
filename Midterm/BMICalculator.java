package Midterm;
import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //เปิดใช้งานตัว Input0

        System.out.print("Enter weight in kilograms: ");

        double weight = sc.nextDouble(); //nextDouble() ใช้ในการ Input ค่าที่เป็น Double เท่านั้น
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble(); 

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is %.2f",bmi); //ใข้ df.format ครอบ bmi เอาไว้เพื่อปัดทศนิยม bmi ตามที่เรากำหนดไว้
        System.out.println();

        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (18.5 <= bmi && bmi < 24.9){
            System.out.println("Normal weight");
        }
        else if (24.9 <= bmi && bmi < 29.9){
            System.out.println("Overweight");
        }
        else if (30 <= bmi){
            System.out.println("Obesity");
        }
    }

}

//Name: Naphat Phoruang
//ID: 6787021
//Section: 1