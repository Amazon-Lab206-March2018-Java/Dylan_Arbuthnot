
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount n = new BankAccount();
		System.out.println(n.getAcct_number());
		n.depositMoney("checking", 1000.00);
		System.out.println(n.getChck_balance());
		n.withdrawMoney("checking", 297.33);
		System.out.println(n.getChck_balance());
		n.depositMoney("saving", 50000.00);
		System.out.println(n.getSave_balance());
		n.withdrawMoney("saving", 11000.50);
		System.out.println(n.getSave_balance());
		System.out.println(n.getAcctTotal());
		System.out.println(BankAccount.getNumOfBankAccounts());
		System.out.println(BankAccount.getAmountOfMoneyStored());
		n.withdrawMoney("checking", 50000.00);
	}
}
