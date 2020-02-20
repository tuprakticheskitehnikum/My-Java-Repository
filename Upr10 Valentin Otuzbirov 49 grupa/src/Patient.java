import java.util.ArrayList;

public class Patient {

	String name;
	String egn;
	double paycheck;
	
	ArrayList<Diagnosis> List1 = new ArrayList<Diagnosis>();
	
	public Patient(String name, String egn, double paycheck, ArrayList<Diagnosis> list1) {
		this.name = name;
		this.egn = egn;
		this.paycheck = paycheck;
		List1 = list1;
	}

	private double payBill(double amount) {
		
		this.paycheck = this.paycheck - amount;
		
		if (this.paycheck>= 0) {
			//System.out.println(this.name+" paid everything");
			return 0;
		} else {
			double debt = this.paycheck*(-1);
			this.paycheck = 0;
			//System.out.println(this.name+" owns money!");
			return debt;
		}
	}
	
	double cureSickness(Diagnosis sickness) throws OutOfMoneyException,NoSuchSicknessException{
		
		if (this.paycheck <=0) {
			
			throw new OutOfMoneyException();
			
		} else if (!this.List1.contains(sickness)) {
			
			throw new NoSuchSicknessException();
			
		} else {
			
			return payBill(sickness.cureCost);
			
		}
		
	}
	
}
