
public class IndividualCust extends Customer{
	
	 
	private String phoneNumber;

	    public IndividualCust(String n, String e, int custId, String creditClass, double discounts, String planAssigned, String phoneNumber) {
	        super(n,e, custId, creditClass, discounts, planAssigned);
	        this.phoneNumber = phoneNumber;
	    }

	    
	    public String getPhoneNumber() {
	        return phoneNumber;
	    }
	}


