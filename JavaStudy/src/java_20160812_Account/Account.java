package java_20160812_Account;

public class Account {

	public int balance;
	
	public void deposit(int depositAmount){
		
		this.balance = this.balance + depositAmount;
		
	}
	
	public void withdraw(int withdrawAmount){
		
		if(withdrawAmount <= this.balance){
			
			this.balance = this.balance - withdrawAmount;
			
		} else {
			
			System.out.println("잔액이 부족합니다");
			
		}
			
	}
	
	public int getBalance(){
		
		return this.balance;
		
	}
	
}
