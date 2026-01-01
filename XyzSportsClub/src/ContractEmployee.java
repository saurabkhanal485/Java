// ContractEmployee.java
import java.util.Date;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, String mobileNo, String emailId, String department, String designation, Date dateOfJoining, double hourlyRate, int hoursWorked) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", Type: Contract, Hourly Rate: %.2f, Hours Worked: %d", hourlyRate, hoursWorked);
    }
}




