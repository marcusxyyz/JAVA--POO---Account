package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}

	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public double depoistValue(double deposit) {
		return balance += deposit;
	}
	
	public double withdrawValue(double withdraw) {
		return balance -= 5.00 + withdraw;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
}
