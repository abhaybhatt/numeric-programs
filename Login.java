import java.util.Date;
class Login{
	static int id = 0;
	String username;
	String password;
	String securityQuestion;
	String securityAnswer;
	Date lastLoginTime;

	Login(){
		id = id + 1;
		username = "ganesh";
		password = "azgaban";
		securityQuestion = "Pet Name";
		securityAnswer = "ganya";
		lastLoginTime = new java.util.Date();
	}

	void loginDetails(){
		System.out.println("---------------Login Details---------------");
		System.out.println("Login ID : "+id);
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		System.out.println("Security Question : "+securityQuestion);
		System.out.println("Security Answer : "+securityAnswer);
		System.out.println("Last Login : "+lastLoginTime);
	}

	public static void main(String args[]){
		Login l1 = new Login();
		l1.loginDetails();
	}
}