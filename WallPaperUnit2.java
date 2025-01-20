import java.util.*;
public class WallPaperUnit2 {
    private int name;
    private double length;
    private char symbol;
    int sum_price = 0;
    int i,j;
    Scanner in = new Scanner(System.in);

    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void wallPaperPrint(int name, double length, char symbol){
        if(name == 1){
            for(i = 1; i<=length; i++){
                for(j = 1; j <= i; j++){
                    System.out.print(j);
                    System.out.print(' ');
                }
                System.out.println();
            }
            sum_price += 100;
        }
        
        else if (name == 2){
            for(i = 1; i<=length; i++){
                for(j = 1; j <=length; j++){
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
            sum_price += 200;
        }
        else if (name == 3){
            for(i = 1; i<=length; i++){
                for(j = 1; j <= length; j++){
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
            sum_price += 300; 
        }


    

    }
    public void wallPaperPrint_1(double length, char symbol){
        for(i = 1; i<=length; i++){
            for(j = 1; j <= i; j++){
                System.out.print(j);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public void wallPaperPrint_2(double length, char symbol){
        for(i = 1; i<=length; i++){
            for(j = 1; j <=length; j++){
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
    public void wallPaperPrint_3(double length, char symbol){
        for(i = 1; i<=length; i++){
            for(j = 1; j <= length; j++){
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
}
