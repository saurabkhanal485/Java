import java.util.Date;
public class Contract extends Employee {
	
	private int hoursWorked;
	private double perHoursRate;
	
	
	public Contract(int id, String name, int mobileNo, String emailId, String dep, String desg, Date doj ,int hours,double perhour) {
		super(id, name,mobileNo,emailId,dep,desg,doj);
		this.hoursWorked=hours;
		this.perHoursRate=perhour;
	}
	@Override
    public double CalculateSalary() {
        return hoursWorked * perHoursRate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Type: Contract, Hours: %d, Rate: %.2f, Net Salary: %.2f",
                hoursWorked, perHoursRate, CalculateSalary());

}
}
