package Midterm;
import java.util.*;

public class Born2DevPlayground {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();
        String address = sc.nextLine();
        String sex = sc.nextLine();
        String tel = sc.nextLine();

        System.out.println("--- Customer Detail ---");
        System.out.println("Name : " + name + " " + surname);
        System.out.println("Address : " + address);
        System.out.println("Gender : " + sex);
        System.out.println("Tel : " + tel);
}
}

