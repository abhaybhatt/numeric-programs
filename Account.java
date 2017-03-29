class Account{
	static int accountNo = 620000;
	String accountType;
	float balance;

	Account(String accountType, float balance){
		accountNo = accountNo + 1;
		this.accountType = accountType
		this.balance = balance;
	}

	void savingsAccount(){
		float rateOfInterest = 4.25;
	}
	void currentAccount(){
		float rateOfInterest = 0.00;
	}
	void termDepositAccount(int timePeriod){
		float rateOfInterest = 8.75;
	}
	void Loan(){
		float rateOfInterest = 12.50;
	}
}