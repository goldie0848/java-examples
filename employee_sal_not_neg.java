import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private int salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Invalid Salary");
        } else {
            this.salary = salary;
        }
    }

    public void displayDetails() {
        if (this.salary >= 0) {
            System.out.println("Employee ID : " + this.empId);
            System.out.println("Employee Name : " + this.name);
            System.out.println("Salary : " + this.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        int id = scanner.nextInt();
        scanner.nextLine(); 
        String name = scanner.nextLine();
        int salary = scanner.nextInt();

        if (salary < 0) {
            System.out.println("Invalid Salary");
        } else {
            emp.setEmpId(id);
            emp.setName(name);
            emp.setSalary(salary);
            emp.displayDetails();
        }
        
        scanner.close();
    }
}