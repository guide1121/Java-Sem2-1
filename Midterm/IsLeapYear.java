package Midterm;
import java.util.*;
public class IsLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean isLeapYear = false;
		if(year % 4 == 0 ) {
			isLeapYear = true;
		}
		if(year % 100 == 0) {
			isLeapYear = false;
		}
		if(year % 400 == 0) {
			isLeapYear = true;
		}
		
		if(isLeapYear) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");			
		}
	}

}
