package Midterm;
import java.util.Scanner;
public class WallPaper2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        WallPaperUnit2 wp = new WallPaperUnit2();
		
		//Task 1: Print out 3 popular styles
		/**************** YOUR CODE HERE (Task 1) *******************/
		System.out.println("=== Welcome to Customized Wallpaper System ===");
		System.out.println("We have 3 popular styles here:");
		System.out.println("=== Style 1 ===");
		//put your code here
		int i,j, n=5;
		for(i=1; i<=n; i++){//row
			for(j=1; j<=i; j++) { //col
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("=== Style 2 ===");
		//put your code here
		for(i=1; i<=n; i++){//row
			for(j=1;j<=n;j++) {
				if(j>=i) {
					System.out.print("_");
				}else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("=== Style 3 ===");
		/**************** YOUR CODE HERE (Task 1) *******************/

        for(i = 1; i<n+1; i++){
            for(j = 1; j <= n; j++){
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
		/************************************************************/
		
		
		//Task 2: Get the size, style and symbol from users and print the output
	
		boolean stopProgram = false;
		while(!stopProgram){
			System.out.print("Please choose your style: ");
			int choice = in.nextInt();
            if(choice == -1){
                System.out.println("bye");
                break;
            }
			System.out.print("Size: ");
			double num = in.nextDouble();
			System.out.print("Symbol: ");
			char symbol = in.next().charAt(0);
			/**************** YOUR CODE HERE (Task 2) *******************/
            wp.wallPaperPrint(choice, num, symbol);
			/************************************************************/
		//}
	
		//Task 3: Bill the user
		/**************** YOUR CODE HERE (Task 3) *******************/

	}
    System.out.print("Total Bill: ");
    System.out.print(wp.sum_price);
}
}