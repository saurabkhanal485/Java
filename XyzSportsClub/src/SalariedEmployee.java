// SalariedEmployee.java
import java.util.Date;

public class SalariedEmployee extends Employee {
    private double basicSalary;

    public SalariedEmployee(String name, String mobileNo, String emailId, String department, String designation, Date dateOfJoining, double basicSalary) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateSalary() {
        double da = 0.10 * basicSalary;
        double hra = 0.15 * basicSalary;
        double pf = 0.12 * basicSalary;
        return basicSalary + da + hra - pf;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", Type: Salaried, Basic Salary: %.2f", basicSalary);
    }
}
