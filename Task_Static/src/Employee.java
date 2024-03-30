
public class Employee {
    private static int totalEmployees = 0;
    private static double totalSalary = 0;
    
    private int empNo;
    private double salary;
    
    public Employee(double salary) {
        totalEmployees++;
        this.empNo = totalEmployees;
        this.salary = salary;
        totalSalary += salary;
    }
    
    public static void displayTotal() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary: " + totalSalary);
    }
    
    public static void main(String[] args) {
        Employee emp1 = new Employee(50000);
        Employee emp2 = new Employee(60000);
        Employee emp3 = new Employee(70000);
        
        displayTotal();
    }
}

