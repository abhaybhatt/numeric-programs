class Transactions{
	int transactionID;
	String transactionType;
	Date transactionTime;
	float amount;

	void deposit(float amt){
		amount = amount + amt;
		System.out.println(amt+" Deposited");
	}

	void withdraw(float amt){
		if(amount<amt){
			System.out.println("Insufficient Balance");
		}else{
			amount = amount - amt;
			System.out.println(amt+" Withdrawn");
		}
	}

	void transfer(int targetAccount){

	}
}