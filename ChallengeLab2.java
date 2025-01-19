import java.util.Scanner;
public class ChallengeLab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n1 = sc.nextDouble();
        Double n2 = sc.nextDouble();
        int st = sc.nextInt();

        switch (st) {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
        
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
//Name: Naphat Phoruang
//ID: 6787021
//Section: 1