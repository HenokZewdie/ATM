import java.util.Date;

public abstract class ATMDisplay implements iATM{

	accountInfor AccInfoObj = new accountInfor();
	Date currentdate = new Date();
	public void setCurrentdate(Date currentdate) {
		this.currentdate = currentdate;
	}
	
	void displayPrompt(){};
}
