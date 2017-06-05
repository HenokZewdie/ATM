import java.util.ArrayList;


public class accountInfor {

ArrayList<ATM> ATMList = new ArrayList<ATM>();
	
	
	ATM ATMObj = new ATM(111111, 1111, 1000.0, "Raya");
	ATM ATMObj2 = new ATM(222222, 2222, 2000.0, "Fee");
	ATM ATMObj3 = new ATM(333333, 3333, 3000.0, "Bilo");
	
	
public accountInfor(int newAccount, int newPIN){
	
	for(int i=0; i<ATMList.size();i++){
		
		if(ATMList.get(i).getAccNumP() == newAccount){
			if(ATMList.get(i).getPIN() == newPIN){
				System.out.println("holaaaaaa");
			}

		}
	}
}
	
	
	
}
/*
	public void validate(int accNum, int pIN) {
for(int i=0; i<ATMList.size();i++){
			
			if(ATMList.get(i).getAccNumP() == ){
				
				
				
				System.out.println("The book Author is : " + ATMList.get(i).getAuthor());
			}
		}
		
	}*/