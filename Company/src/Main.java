
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> vendorProducts = Arrays.asList("Fiber Optic Cables", "Routers");
        Vendor vendor1 = new Vendor("Tech Supplies Inc.", "contact@techsupplies.com", 101, "555-1234", vendorProducts);

   
        IndividualCust individualCustomer1 = new IndividualCust("John Doe", "john.doe@email.com", 1, "Good", 0.05, "Basic Plan", "555-5678");

        
        List<String> companyNumbers = Arrays.asList("555-8765", "555-4321");
        CompanyCustomer companyCustomer1 = new CompanyCustomer("Corp Solutions", "contact@corpsolutions.com", 2, "Excellent", 0.10, "Business Plan", "Jane Smith", 50000.00, 10, companyNumbers);

        
        System.out.println("Vendor Name: " + vendor1.getname());
        System.out.println("Individual Customer Phone: " + individualCustomer1.getPhoneNumber());
        System.out.println("Company Customer Credit Line: " + companyCustomer1.getCreditLine());
    }
}
