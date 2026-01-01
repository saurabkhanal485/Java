
public abstract class Customer extends Person {
	private int custId;
	private String creditClass;
	private double discounts;
	private String planAssigned;
	
	
	public Customer(String n,String e,int id, String credit, double dis,String plan) {
		super(n,e);
		this.custId=id;
		this.creditClass=credit;
		this.discounts=dis;
		this.planAssigned=plan;
	}
	
	public int getcustId() {
		return custId;
	}
	
	public String getcreditClass() {
		return creditClass;
	}
	
	public double getdiscounts() {
		return discounts;
	}
	
	public String getplanAssigned() {
		return planAssigned;
	}

}
