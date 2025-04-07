import java.util.Scanner;


abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public abstract double calculatePay();


    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}


class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, int id, double hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}


class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

public class EmployeePaySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee;

        System.out.println("Enter Employee Type (1. Hourly 2. Salaried): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter hours worked: ");
            double hours = scanner.nextDouble();
            System.out.print("Enter hourly rate: ");
            double rate = scanner.nextDouble();
            employee = new HourlyEmployee(name, id, hours, rate);
        } else {
            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();
            employee = new SalariedEmployee(name, id, salary);
        }

        
        System.out.println("\nEmployee Details:");
        employee.getEmployeeDetails();
        System.out.println("Calculated Pay: " + employee.calculatePay());
    }
}
