package java_20160812_Account;

public class MinusAccount extends Account {

	// variable
	private int loan;

	// constructor
	public MinusAccount(int loan) {

		this.loan = loan;

	}

	public void setLoan(int loan) {

		this.loan = loan;

	}

	@Override
	public void withdraw(int withdrawAmount) {

		if(withdrawAmount <= (this.balance + this.loan)){

			this.balance = this.balance - withdrawAmount;

		} else {

			System.out.println("잔액이 부족합니다");

		}

	}
	
}