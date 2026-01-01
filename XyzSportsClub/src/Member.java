// Member.java
public class Member {
    private static int nextMemberId = 1;
    private int id;
    private String name;
    private String mobileNo;
    private String emailId;
    private String membershipType;
    private double amountPaid;

    public Member(String name, String mobileNo, String emailId, String membershipType, double amountPaid) {
        this.id = nextMemberId++;
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.membershipType = membershipType;
        this.amountPaid = amountPaid;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Membership: " + membershipType + ", Paid: " + amountPaid;
    }
}
