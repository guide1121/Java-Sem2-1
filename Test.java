import java.util.*;
public class Test{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // double w = sc.nextDouble();
        // double h = sc.nextDouble();
        // System.out.println("area : " + w*h);

        // double x1 = sc.nextDouble();
        // double x2 = sc.nextDouble();
        // double x3 = sc.nextDouble();
        // System.out.println("The average is "+ (x1+x2+x3)/3);

        // double b = sc.nextDouble();
        // double h = sc.nextDouble();
        // System.out.println((b*h)/2);

        // double f = sc.nextDouble();
        // System.out.println(f+"F is equal to " +((f-32)/9)*5);

        // double min = sc.nextDouble();
        // System.out.println((int)min/60 + ":"+ (int)(min%60));

        int num = sc.nextInt();
        String digitName = "..." ;    
        switch (num) {
            case 1:
                digitName = "One";
                break;
            case 2:
                digitName = "Two";
                break;
            case 3:
                digitName = "Three";
                break;
            case 4:
                digitName = "Four";
                break;
            case 5:
                digitName = "Five";
                break;
        
            default:
                break;
        }
        System.out.println(digitName);



    }
}