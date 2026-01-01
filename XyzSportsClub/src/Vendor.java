// Vendor.java
import java.util.Date;

public class Vendor extends Employee {
    private double amount;
    private int numberOfEmployees;

    public Vendor(String name, String mobileNo, String emailId, String department, String designation, Date dateOfJoining, double amount, int numberOfEmployees) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.amount = amount;
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double calculateSalary() {
        double gst = amount * 0.18;
        return amount + gst;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", Type: Vendor, Amount: %.2f, No. of Employees: %d", amount, numberOfEmployees);
    }
}
