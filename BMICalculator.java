import java.util.*;
import java.text.DecimalFormat; //Class กำหนดจำนวนจุดทศนิยม

public class BMICalculator {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00"); //กำหนดจำนวนจุดทศนิยมที่ต้องการ
        Scanner sc = new Scanner(System.in); //เปิดใช้งานตัว Input

        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble(); //nextDouble() ใช้ในการ Input ค่าที่เป็น Double เท่านั้น
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble(); 

        double bmi = weight / (height * height);

        System.out.println("Your BMI is "+ df.format(bmi)); //ใข้ df.format ครอบ bmi เอาไว้เพื่อปัดทศนิยม bmi ตามที่เรากำหนดไว้

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
