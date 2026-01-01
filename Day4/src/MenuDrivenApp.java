
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MenuDrivenApp {
	
    private static List<Employee> employees = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        initializeDummyData();
        
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    displayEmployeesByType();
                    break;
                case 2:
                    searchEmployeeById();
                    break;
                case 3:
                    searchEmployeeByName();
                    break;
                case 4:
                    displayAllEmployees();
                    break;
                case 5:
                    calculateAndDisplaySalaryByDesignation();
                    break;
                case 6:
                    displayEmployeesByDepartment();
                    break;
                case 7:
                    System.out.println("Exiting application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- XYZ Sports Club Management System ---");
        System.out.println("1. Display Employees by Type");
        System.out.println("2. Search Employee by ID");
        System.out.println("3. Search Employee by Name");
        System.out.println("4. Display All Employees");
        System.out.println("5. Calculate and Display Salary by Designation");
        System.out.println("6. Display 5 Employees from a Specific Department");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private static void initializeDummyData() {
        try {
        	 try {
                
        } catch (Exception e) {
            e.printStackTrace();
        
    }

    // Menu option 1
    private static void displayEmployeesByType() {
        System.out.println("Display Employees by Type:");
        System.out.println("1. Salaried");
        System.out.println("2. Contract");
        System.out.println("3. Vendor");
        System.out.print("Enter employee type: ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("--- Selected Employees ---");
        boolean found = false;
        for (Employee emp : employees) {
            if (typeChoice == 1 && emp instanceof SalariedEmployee) {
                System.out.println(emp);
                found = true;
            } else if (typeChoice == 2 && emp instanceof Contract) {
                System.out.println(emp);
                found = true;
            } else if (typeChoice == 3 && emp instanceof Vendor) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees of this type found.");
        }
    }
    
    // Menu option 2
    private static void searchEmployeeById() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employee foundEmployee = null;
        for (Employee emp : employees) {
            if (emp.getid() == id) {
                foundEmployee = emp;
                break;
            }
        }

        if (foundEmployee != null) {
            System.out.println("--- Employee Found ---");
            System.out.println(foundEmployee);
            System.out.printf("Salary: %.2f\n", foundEmployee.CalculateSalary());
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }
    
    // Menu option 3
    private static void searchEmployeeByName() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getname().toLowerCase().contains(name.toLowerCase())) {
                foundEmployees.add(emp);
            }
        }

        if (!foundEmployees.isEmpty()) {
            System.out.println("--- Employees Found ---");
            for (Employee emp : foundEmployees) {
                System.out.println(emp);
            }
        } else {
            System.out.println("No employees found with name containing '" + name + "'.");
        }
    }
    
    // Menu option 4
    private static void displayAllEmployees() {
        System.out.println("--- All Employees ---");
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    
    // Menu option 5
    private static void calculateAndDisplaySalaryByDesignation() {
        System.out.print("Enter designation: ");
        String designation = scanner.nextLine();

        boolean found = false;
        System.out.println("--- Salary Calculation for " + designation + "s ---");
        for (Employee emp : employees) {
            if (emp.getdesignation().equalsIgnoreCase(designation)) {
                System.out.printf("%s, ID %d: Salary = %.2f\n", emp.getname(), emp.getid(), emp.calculateSalary());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with designation '" + designation + "'.");
        }
    }

    // Menu option 6
    private static void displayEmployeesByDepartment() {
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        List<Employee> deptEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getdepartment().equalsIgnoreCase(department)) {
                deptEmployees.add(emp);
            }
        }

        if (deptEmployees.isEmpty()) {
            System.out.println("No employees found in department '" + department + "'.");
            return;
        }

        // Sort by name for a consistent "top 5" display
        deptEmployees.sort(Comparator.comparing(Employee::getname));

        System.out.println("--- Top 5 Employees in " + department + " ---");
        for (int i = 0; i < Math.min(5, deptEmployees.size()); i++) {
            System.out.println(deptEmployees.get(i));
        }
    }
}
