import java.util.Scanner;

public class ATM {

	private int accNumP, PIN;
	private double balance;
	private String name; 
	public ATM(){
		
	}
	
	public ATM(int ACOUNT, int PINUMBER, double d, String name) {
		this.accNumP=ACOUNT;
		this.PIN = PINUMBER;
		this.balance=d;
		this.name=name;
	}
	public int getAccNumP() {
		return accNumP;
	}

	public void setAccNumP(int accNumP) {
		this.accNumP = accNumP;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}
	
	{
		int accNum, PIN;
		double deposit, Balance = 0.0; 
		String Name;
		Scanner input = new Scanner(System.in);

		String ServType; //Service type

		System.out.println("Enter your 6 digit account Number: ");
		accNum = input.nextInt();
		System.out.println("Enter your 4 digit PIN Number: ");
		PIN = input.nextInt();
//		accountInfor accOBJ = new accountInfor(accNum, PIN);
	
	}

	
}



/*
		
		//while(){}
		System.out.println("Which Service you want to get? Deposit   Withdrawal   Balance");
		ServType = input.nextLine();

		if(ServType.equalsIgnoreCase("Deposit")){
			System.out.println("How much do you want to deposite? ");
			deposit =input.nextDouble();

		}
		else if (ServType.equalsIgnoreCase("Withdrawal")){}
		else if (ServType.equalsIgnoreCase("Balance")){}
		else {System.out.println("Wrong Service");}
*/




























/*public ATM(int AccNum, int pin, double Balance, String Name){
		this.accNum = AccNum;
		this.PIN = pin;
		this.balance = Balance;
		this.name = Name;

	}

	public static int getAccNum() {
		return accNum;
	}

	public static void setAccNum(int accNum) {
		ATM.accNum = accNum;
	}

	public static int getPIN() {
		return PIN;
	}

	public static void setPIN(int pIN) {
		PIN = pIN;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
 */