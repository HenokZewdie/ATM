import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class accountInfor implements iATM{


	static Scanner input = new Scanner(System.in);
	static ArrayList<ATM> ATMList = new ArrayList<ATM>();
	ATM ATMOBJ = new ATM();
	static double Total = 0.0;
	double tempBalance;
	static int index;
	public void accout(int newAccount, int newPIN) throws IOException{

		ATM ATMObj = new ATM(111111, 1111, 10000.0, "Raya");
		ATM ATMObj2 = new ATM(222222, 2222, 2000.0, "Fee");
		ATM ATMObj3 = new ATM(333333, 3333, 3000.0, "Bilo");

		ATMList.add(ATMObj);
		ATMList.add(ATMObj2);
		ATMList.add(ATMObj3);

		for(index=0; index<ATMList.size();index++){

			if(ATMList.get(index).getAccNumP() == newAccount){
				if(ATMList.get(index).getPIN() == newPIN){
					System.out.println("Hello Maya");
					 tempBalance = ATMList.get(index).getBalance();
					 System.out.println(tempBalance);
					 ATMObj.serviceType();
				}
			}

		}// End of for loop	
	}

	@Override
	public double deposit(double depAmount) {
		Total = depAmount + tempBalance;
		//ATMList.set(index, Total);//how to set to Array list
		//ATMList.add(index, ATMOBJ.setBalance(Total));;
		
		return Total;
	}
	
	@Override
	public double withdrawal(double withdrawal) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double balance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
