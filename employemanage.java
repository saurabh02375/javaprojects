import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void displayEmployees() {
        System.out.println("Registered Employees:");
        for (Employee employee : employees) {
            System.out.println(employee.getId() + ": " + employee.getName());
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Adding employees
        Employee employee1 = new Employee("John Doe", "E001");
        Employee employee2 = new Employee("Jane Smith", "E002");
        Employee employee3 = new Employee("David Johnson", "E003");

        ems.addEmployee(employee1);
        ems.addEmployee(employee2);
        ems.addEmployee(employee3);

        // Removing an employee
        ems.removeEmployee(employee2);

        // Displaying registered employees
        ems.displayEmployees();
    }
}

class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
