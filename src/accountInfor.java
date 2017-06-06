import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class accountInfor implements iATM{


	static Scanner input = new Scanner(System.in);
	static ArrayList<ATM> ATMList = new ArrayList<ATM>();
	
	ATM ATMOBJ = new ATM();

	static double tempBalance, abal = 101010, Total, balance;
	static int index;
	public void accout(int newAccount, int newPIN) throws IOException{
		
		ATM ATMObj = new ATM(111111, 1111, balance, "Raya");		
		ATM ATMObj2 = new ATM(222222, 2222, 2000.0, "Fee");
		ATM ATMObj3 = new ATM(333333, 3333, 3000.0, "Bilo");
		ATM a = new ATM();
		a.setAccNumP(444444);
		a.setPIN(4444);
		a.setBalance(abal);
		a.setName("Mee");
			
		ATMList.add(ATMObj);
		ATMList.add(ATMObj2);
		ATMList.add(ATMObj3);
		ATMList.add(a);
		
		for(index=0; index<ATMList.size();index++){

			if(ATMList.get(index).getAccNumP() == newAccount){
				if(ATMList.get(index).getPIN() == newPIN){
					balance = ATMList.get(index).getBalance();
					System.out.println("Hello  " + ATMList.get(index).getName());
					 Total =balance;
					 System.out.println("Your current balance is  " + balance);
					 ATMObj.serviceType();
				}
			}

		}// End of for loop	
	}

		
	@Override
	public double deposit(double depAmount) {
		Total = depAmount + Total;
		ATMList.get(index).setBalance(Total);
		System.out.println("Your current Balance after saving is  " + Total);
		
		return Total;
	}
	
	@Override
	public double withdrawal(double withdrawal) {
		balance -=withdrawal;
		return 0;
	}

	@Override
	public double balance() {
		System.out.println(balance);
		return 0;
	}
}
