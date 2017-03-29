class Customer{
	static int customerID = 0;
	String name;
	String dateOfBirth;
	String address;
	String phoneNo;
	String emailAddess;

	Customer(String name, String dateOfBirth, String address, String phoneNo, String emailAddess){
		customerID = customerID + 1;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNo = phoneNo;
		this.emailAddess = emailAddess;
	}

	void dispalyInfo(){
		System.out.println("---------------Customer Details---------------");
		System.out.println("Customer ID : " +customerID);
		System.out.println("Customer Name : "+name);
		System.out.println("Date of Birth : "+dateOfBirth);
		System.out.println("Customer Address : "+address);
		System.out.println("Customer Phone Number : "+phoneNo);
		System.out.println("Customer Email Address : "+emailAddess);
	}

	public static void main(String args[]){
		Customer c1 = new Customer("Ganesh Chauhan","1991-10-16","Room No-2, Vrindavan Soc., IIT Market","9769023178","ganesh.c06@gmail.com");
		c1.dispalyInfo();
		Customer c2 = new Customer("Mangesh Chaudhari","1989-03-31","Ganesh Nagar","9221243505","mangesh.chaudhari@gmail.com");
		c2.dispalyInfo();
	}
}