
public class BankAccount {
	private String acct_number;
	private Double chck_balance;
	private Double save_balance;
	public static Integer numOfBankAccounts = 0;
	public static Double amountOfMoneyStored = 0.00;
	public BankAccount() {
		this.acct_number = this.genAcctNumber();
		this.chck_balance = 0.00;
		this.save_balance = 0.00;
		numOfBankAccounts++;
	}
	private String genAcctNumber() {
		String number = "";
		for (int i = 0; i < 10; i++) {
			int new_num = (int)(Math.random() * 10);
			number += new_num;
		}
		return number;
	}
	public void depositMoney(String acct, Double val) {
		if (acct == "checking") {
			this.chck_balance += val;
		} else if (acct == "saving") {
			this.save_balance += val;
		}
		amountOfMoneyStored += val;
	}
	public void withdrawMoney(String acct, Double val) {
		if (acct == "checking") {
			if (this.chck_balance - val < 0.00) {
				System.out.println("Cannot withdraw with insufficient funds");
			} else {
				this.chck_balance -= val;
				System.out.println("Successfully withdrew $" + val + " from your checking account. Remaining Balance: " + this.chck_balance);
			}
		} else if (acct == "saving") {
			if (this.save_balance - val < 0.00) {
				System.out.println("Cannot withdraw with insufficient funds");
			} else {
				this.save_balance -= val;
				System.out.println("Successfully withdrew $" + val + " from your savings account. Remaining Balance: " + this.save_balance);
			}
		}
	}
	public Double getAcctTotal() {
		Double total = this.chck_balance + this.save_balance;
		return total;
	}
	public String getAcct_number() {
		return acct_number;
	}
	public Double getChck_balance() {
		return chck_balance;
	}
	public Double getSave_balance() {
		return save_balance;
	}
	public static Integer getNumOfBankAccounts() {
		return numOfBankAccounts;
	}
	public static Double getAmountOfMoneyStored() {
		return amountOfMoneyStored;
	}
}
