import java.util.Date;

public class Vehicle {

	private int vId;
	private String vName;
	private String vType;
	private Date Purchase;
	
	
	public Vehicle() {
		System.out.println("Default Constructor");
		vId=0;
		vName=null;
		vType=null;
		Purchase=null;
		
		

	}
	
	public Vehicle(int id,String nm,String type,Date purch) {
		this.vId=id;
		this.vName=nm;
		this.vType=type;
		this.Purchase=purch;
	}
	
	public void setvId(int id) {
		this.vId=id;
	}
	public void setvName(String nm) {
		this.vName=nm;
	}
	
	public void setvType(String type) {
		this.vType=type;
	}
	
	public void setPurchase(Date purch) {
		this.Purchase=purch;
	}
	
	public int getvId() {
		return vId;
	}
	
	public String getvName() {
		return vName;
	}
	
	public String getvType() {
		return vType;
	}
	
	public Date getPurchase() {
		return Purchase;
	}
	
	public String toString() {
		return "vId: "+vId + "\n"+ "vName: " + vName + "\n" + "vType: "+ vType + "\n" + "Purchase:"+Purchase;
		
	}

}
