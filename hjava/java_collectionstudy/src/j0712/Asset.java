package j0712;

public class Asset {



	private String bank;
	private String balance;
	private String accountNum;
	private int holder;
	
	public Asset(String bank, String balance, String accountNum, int holder) {
		this.bank=bank;
		this.balance=balance;
		this.accountNum=accountNum;
		this.holder=holder;
	}
	
	@Override
	public boolean equals(Object o) {
		Asset temp = (Asset)o;
		boolean isBank=this.bank.equals(temp.bank);
		if(isBank) {
			isBank=this.accountNum.equals(temp.accountNum);
			
			
		}
		return isBank;
	}
	@Override
	public String toString() {
		return bank+","+balance+","+accountNum+","+holder;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public int getHolder() {
		return holder;
	}
	public void setHolder(int holder) {
		this.holder = holder;
	}
	



}
