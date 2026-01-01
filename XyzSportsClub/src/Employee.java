// Employee.java (Abstract Class)
import java.util.Date;

public abstract class Employee {
    private static int nextEmployeeId = 1;
    private int id;
    private String name;
    private String mobileNo;
    private String emailId;
    private String department;
    private String designation;
    private Date dateOfJoining;

    public Employee(String name, String mobileNo, String emailId, String department, String designation, Date dateOfJoining) {
        this.id = nextEmployeeId++;
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }
    
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Dept: " + department;
    }
}
