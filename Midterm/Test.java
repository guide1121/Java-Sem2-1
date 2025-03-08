package Midterm;
import java.util.*;

public class Test{
    public static void main(String[] args) {
        // WallPaperUnit wallpaper = new WallPaperUnit("Guide", 1);
        // System.out.println(wallpaper.getName());
        // System.out.println(wallpaper.getLength());
        /*--------------------------------------------- */
        // Scanner sc = new Scanner(System.in);
        // int m = 1;
        // int s = 2;
        // boolean flag = true;
        // while(flag){
        //     System.out.println("=== Welcome to COVID-19 Vaccine Registration System ===");
        //     System.out.println("Please choose your vaccine: ");
        //     System.out.println("[S]inovac");
        //     System.out.println("[M]oderna");
    
        //     char choice = sc.next().charAt(0);
        //     if(choice == 'm'){
        //         if(m > 0){
        //             sc.nextLine();
        //             System.out.print("Name: ");
        //             String name = sc.nextLine();
        //             System.out.print("Telephone No : ");
        //             String tel = sc.nextLine();
        //             System.out.println("Congratulation ! " + name + "We will call you "+ tel);
        //             m -= 1;
        //         }
        //         else{
        //             System.out.println("Sorry");
        //         }
        //     }
        //     else if(choice == 's'){
        //         if(s > 0){
        //             sc.nextLine();
        //             System.out.print("Name: ");
        //             String name = sc.nextLine();
        //             System.out.print("Telephone No : ");
        //             String tel = sc.nextLine();
        //             System.out.println("Congratulation ! " + name + "We will call you "+ tel);
        //             s -= 1;
        //         }
        //         else{
        //             System.out.println("Sorry");
        //         }
        //     }
        //     else if(choice == 'x'){
        //         System.out.println("--Good bye--");
        //         break;
        //     }
        // }
       
       /*----------------------------------------------------------------- */
       
       for(int i = 0; i<=9; i++){
        for(int j = 9; j>=0; j--){
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();
       }

        
    }
}