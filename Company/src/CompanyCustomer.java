
import java.util.List;

public class CompanyCustomer extends Customer {
    private String relationshipManager;
    private double creditLine;
    private int extensions;
    private List<String> listOfNumbers;

    public CompanyCustomer(String n, String e, int custId, String creditClass, double discounts, String planAssigned, String relationshipManager, double creditLine, int extensions, List<String> listOfNumbers) {
        super(n, e, custId, creditClass, discounts, planAssigned);
        this.relationshipManager = relationshipManager;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.listOfNumbers = listOfNumbers;
    }

    
    public String getRelationshipManager() {
        return relationshipManager;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public int getExtensions() {
        return extensions;
    }

    public List<String> getListOfNumbers() {
        return listOfNumbers;
    }
}
