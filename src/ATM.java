import java.io.IOException;
import java.util.Scanner;

public class ATM {

	private int accNumP, PIN;
	private double balance;
	private String name; 
	private int newAccount, newPIN;
	
	Scanner input = new Scanner(System.in);
	
	public ATM(){}
	public ATM(int ACOUNT, int PINUMBER, double d, String name) {
		this.accNumP=ACOUNT;
		this.PIN = PINUMBER;
		this.balance=d;
		this.name=name;
	}
	public void prompt() throws IOException {
		accountInfor accOBJ = new accountInfor();
	System.out.println("Enter Account Number : ");
	newAccount = input.nextInt();
	System.out.println("Enter Your Pin : ");
	newPIN = input.nextInt();
	accOBJ.accout(newAccount, newPIN);// call the method To validate the Acc and PIN
	}
	
	public void serviceType()throws IOException{
		accountInfor accOBJ = new accountInfor();
		System.out.println("Which Service you want to get? Deposit(d)   Withdrawal(w)   Balance(b)");
		String ServType = input.nextLine();
		if(ServType.equalsIgnoreCase("deposit") || ServType.equalsIgnoreCase("d")){
			System.out.println("How much do you want to save?  ");
			double depAmount = input.nextDouble();
			accOBJ.deposit(depAmount);
			
		}
		else if (ServType.equalsIgnoreCase("withdrawal") || ServType.equalsIgnoreCase("w")){
			System.out.println("How much do you want to withdrawal?  ");
			double withAmount = input.nextDouble();
			accOBJ.withdrawal(withAmount);
		}
		else if(ServType.equalsIgnoreCase("balance") || ServType.equalsIgnoreCase("b")){
			getBalance();
		}
		else {System.out.println("Wrong Input");}
			
		//accOBJ.accout(newAccount, newPIN);
		}
	
	public void displayPrompt(){
		System.out.println("Do you want a receipt? ");
		String receipt = input.nextLine();
		if(receipt.equalsIgnoreCase("y")){
			
		}
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
	

	
}