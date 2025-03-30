//Name: Naphat Phoruang
//ID: 6787021
//Section: 1

import java.util.Scanner;

import javax.management.monitor.MonitorSettingException;

import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab11 {
    public static int balance = 3000;

    // ------------Task2----------//
    public static void withDraw(int amount) throws Exception, LessThanZeroException, MoreThanBalanceException {
        // ---Put your code here---//

        if (amount < 0) {
            // Challenge
            // throw new LessThanZeroException(amount);
            // Lab
            throw new Exception("You must enter amount > 0");
        } else if (amount > balance) {
            // Challenge
            // throw new MoreThanBalanceException(amount);
            // Lab
            throw new Exception("Insufficient amount to withdraw");
        }

        // -------------------------//
        balance -= amount;
        System.out.println("withdraw: " + amount);
        System.out.println("balance: " + balance);

    }

    public static void main(String[] args) {

        // --------------Task1--------------//
        // task1.1
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }

        // task1.2
        int x;
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            x = reader.nextInt(); // possibly run-time error
            System.out.println("Your number is " + x);
        } catch (InputMismatchException e) {
            System.out.println("Exception occurred.");
        }

        // task1.3
        String[] list = { "$123", "456" };
        try {
            double amount = Double.parseDouble(list[0]);
            System.out.println("The amount at index 2 " + amount);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception.");
        } finally {
            System.out.println("Program Ended");
        }

        // --------------Task2--------------//

        try {
            int balance = 3000;
            Scanner reader2 = new Scanner(System.in);
            System.out.print("Enter amount: ");
            int bal = reader2.nextInt();
            withDraw(bal);

        }
        // Challenge
        // catch(LessThanZeroException e){
        // System.out.println("Invalid amount (less than 0): " + e.getAmount());
        // }

        // catch(MoreThanBalanceException e){
        // System.out.println("Invalid amount (more than balance): " + e.getAmount());
        // }

        // lab
        catch (Exception e) {
            e.printStackTrace();

        }

    }

}