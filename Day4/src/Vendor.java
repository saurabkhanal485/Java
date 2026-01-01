import java.util.Date;
public class Vendor extends Employee {
	private  int numberOfEmployees;
	private double amount;
	
	
	public Vendor( String name, int mobileNo, String emailId, String dep, String desg, Date doj,int no,double amt) {
		super(no, name,mobileNo,emailId,dep,desg,doj);
		this.numberOfEmployees=no;
		this.amount=amt;
		
	}
	
	@Override
    public double CalculateSalary() {
        return amount + amount * 0.18; // 18% GST
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Type: Vendor, No. of Employees: %d, Amount: %.2f, Total Amount: %.2f",
                numberOfEmployees, amount, CalculateSalary());
    }

}
