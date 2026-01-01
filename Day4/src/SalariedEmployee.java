import java.util.Date;

public class SalariedEmployee extends Employee {
	private double basicSalary;
	
	
	public SalariedEmployee(int id, String name, int mobileNo, String emailId, String dep, String desg, Date doj, double sal)
	{
	super(id,name,mobileNo,emailId,dep,desg,doj);
	this.basicSalary=sal;
	}
	
	@Override
	public double CalculateSalary() {
        double da = 0.10 * basicSalary;
        double hra = 0.15 * basicSalary;
        double pf = 0.12 * basicSalary;
        return basicSalary + da + hra - pf;
    }
	
	public String toString() {
        return super.toString() + String.format(", Type: Salaried, Basic: %.2f, Net Salary: %.2f",
                basicSalary, CalculateSalary());
	}
	
	
}
