import java.util.Date;

public abstract class Employee {
	private int id;
	private String name;
	private int mobileNo;
	private String emailId;
	private String department;
	private String designation;
	private Date dateOfJoining;
	
	
	public Employee(int id, String name, int mobileNo, String emailId, String dep, String desg, Date doj) {
		this.id=Id.employeeIdCounter;
		this.name=name;
		this.mobileNo=mobileNo;
		this.emailId=emailId;
		this.department=dep;
		this.designation=desg;
		this.dateOfJoining=doj;
	}
	
	public abstract double CalculateSalary();
		
	
	
	public int getid() {
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	public int getmobileNo() {
		return mobileNo;
	}
	
	public String getdepartment() {
		return department;
	}
	
	public String getdesignation() {
		return designation;
	}
	
	public Date dateOfJoining() {
		return dateOfJoining;
	}
	
	
	public String toString() {
		return "ID:"+id + "Name:"+name + "MobileNo:" +mobileNo + "DepartMent:"+ department + "Designation:"+ designation + "Date Of Joining:"+dateOfJoining;
	}

}
