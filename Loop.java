import java.util.*;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                System.out.print(' ');
            }
            System.out.println();
        }
        for(int i = 0; i<5; i++){
            System.out.print("  ".repeat(i));
            System.out.print("_ ".repeat(5-i));
            System.out.println();
        }

        for(int i = 1; i<6; i++){
            for(int j = 1; j <= 6; j++){
                if(j <= i){
                    System.out.print(j);
                    System.out.print(" ");
                }
                else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }

        boolean flag = true;

        while(flag){

            System.out.print("Please choose your style: ");
            int choice = sc.nextInt();
            System.out.print("Size: ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.print("Symbol: ");
            String symbol = sc.nextLine();
    
            if(choice == 1){
                for(int i = 1; i<num+1; i++){
                    for(int j = 1; j <= i; j++){
                        System.out.print(j);
                        System.out.print(' ');
                    }
                    System.out.println();
                }
            }

            else if (choice == 2){
                for(int i = 1; i<=num; i++){
                    for(int j = 1; j <=num; j++){
                        if(j >= i){
                            System.out.print(symbol);
                        }
                        else{
                            System.out.print(" ");
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }

            else if (choice == 3){
                for(int i = 1; i<=num; i++){
                    for(int j = 1; j <= num; j++){
                        if(j <= i){
                            System.out.print(j);
                        }
                        else{
                            System.out.print(symbol);
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
            
            else if (choice == -1){
                System.out.println("bye");
                break;
            }      
          }
    }
}