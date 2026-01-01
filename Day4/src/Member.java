
public class Member {
	
	private int id;
	private String name;
	private int mobileNo;
	private String emailId;
    private String memberShipType;
    private double amountPaid;
    
    
    public Member(int id,String name,int mobileNo,String emailId,String member,double amount) {
    	this.id=Id.getNewmemberId();
    	this.name=name;
    	this.mobileNo=mobileNo;
    	this.emailId=emailId;
    	this.memberShipType=member;
    	this.amountPaid=amount;
    }
    
    public int getid() {
    	return id;
    }
    
    public String getname() {
    	return name;
    }
    
    public int getmobileNo() {
    	return mobileNo;
    }
    
    public String getemailId() {
    	return emailId;
    }
    
    public String getmemberShipType() {
    	return memberShipType;
    }
    
    public double getamountPaid() {
    	return amountPaid;
    }
    
    public String toString() {
    	return "Id:"+id + "Name:"+name + "MobileNo:"+mobileNo + "MemberShip:"+memberShipType + "Amount:"+amountPaid;
    }

}
