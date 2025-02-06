//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
import java.util.ArrayList;
import java.util.List;

public class Bank {
	//1.variable
	private ArrayList<BankAccount> accounts;
	//2.constructor
	public Bank(){
		accounts = new ArrayList<BankAccount>();
	}
	//3.methods
	//add an account to this bank
	public void addAccount(BankAccount a){
		accounts.add(a); 
	}
	//gets the sum of the balances of all accounts in this bank
	public double getTotalBalance(){
		
		//**************** YOUR CODE HERE****************
		double totalBalance = 0;
		for(BankAccount a : accounts){
			totalBalance += a.getBalance(); //รวมยอดเงินทุกบัญชีในธนาคาร
		}
		return totalBalance;
		//*********************************************
	}
	//counts the number of bank account whose balance is at least given value.
	public int countBalanceAtLeast(double atLeast){
		
		//**************** YOUR CODE HERE****************
		int counts = 0;
		for(BankAccount a : accounts){
			if (a.getBalance() > atLeast){ //ดึงจำนวนเงินแต่ละบัญชีด้วย .getBalance และหาบัญชีที่มีน้อยกว่าที่เรากำหนดไว 
				counts +=1; //นับจำนวนบัญชีตามเงื่อนไข
			} 
		}
		return counts;
		//*********************************************
	}
	
	//finds a bank account with a given number
	public BankAccount find(int accountNumber){
		
		//**************** YOUR CODE HERE****************
		for(BankAccount a : accounts){
			if (a.getAccountNumber() == accountNumber){ //ตรวจสอบว่าบัญชีไหน เลขตรงกับที่เรากำหนด
				return a; //ถ้าเจอ return บัญชีนั้นออกไปทั้งบัญชี
			} 
		}
		return null;
		//*********************************************
	}
	
	//gets the bank account with the largest balance.
	public BankAccount getMax(){
		
		//**************** YOUR CODE HERE****************
		BankAccount max = accounts.get(0); //กำหนดตัวมากสุดเป็นตัวแรกก่อน
		for(BankAccount a : accounts){
			if (a.getBalance() > max.getBalance()){
				 max = a; //ถ้าเจอตัวที่มากกว่า กำหนด max เป็นตัวที่มากกว่า
			} 
		}
		return max;
		//*********************************************
	}
	
	//gets the bank account with the minimum balance.
	public BankAccount getMin(){
		
		//**************** YOUR CODE HERE****************
		BankAccount min = accounts.get(0); //กำหนดตัวมากสุดเป็นตัวแรกก่อน
		for(BankAccount a : accounts){
			if (a.getBalance() < min.getBalance()){
				 min = a; //ถ้าเจอตัวที่มากกว่า กำหนด min เป็นตัวที่น้อยกว่า
			} 
		}
		return min;
		//*********************************************
	}
	
	
	
	
	
}