
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SportsClub {
    private List<Employee> employees = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    
    public void addEmployee(Employee employee) { employees.add(employee); }
    public void addMember(Member member) { members.add(member); }

    
    public void displayEmployeesByType(String type) {
        System.out.println("--- " + type + " Employees ---");
        for (Employee emp : employees) {
            if (emp.getClass().getSimpleName().equals(type + "Employee") || emp.getClass().getSimpleName().equals(type)) {
                System.out.println(emp);
            }
        }
    }

    
    public Employee searchEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getid() == id) {
                return emp;
            }
        }
        return null;
    }

    
    public List<Employee> searchEmployeeByName(String name) {
        return employees.stream()
                .filter(emp -> emp.getname().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    
    public void displayAllEmployees() {
        System.out.println("--- All Employees ---");
        employees.forEach(System.out::println);
    }

    
    public void calculateSalaryByDesignation(String designation) {
        System.out.println("--- Salary Calculation for " + designation + " ---");
        employees.stream()
                .filter(emp -> emp.getdesignation().equalsIgnoreCase(designation))
                .forEach(emp -> System.out.printf("Employee: %s, Net Salary: %.2f\n", emp.getname(), emp.CalculateSalary()));
    }

    
    public void displayFiveEmployeesByDepartment(String department) {
        System.out.println("--- 5 Employees from " + department + " ---");
        employees.stream()
                .filter(emp -> emp.getdepartment().equalsIgnoreCase(department))
                .limit(5)
                .forEach(System.out::println);
    }

    
    public void displayAllMembers() {
        System.out.println("--- All Members ---");
        members.forEach(System.out::println);
    }
}
