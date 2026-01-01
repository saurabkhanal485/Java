import java.util.List;

public class Vendor extends Person {
	
	private int vendorId;
	private String vendorEmail;
	 private List<String> productsSupplied;
	
	
	
	public Vendor(String n,String e,int id, String email,List<String> productsSupplied) {
		super(n,e);
		this.vendorId=id;
		this.vendorEmail=email;
		this.productsSupplied=productsSupplied;
	}
	
	public int getvendorId() {
		return vendorId;
	}
	
	public String getvendorEmail() {
		return vendorEmail;
	}
	
	public List<String> getProductsSupplied() {
        return productsSupplied;
    }

}
