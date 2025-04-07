class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeDetails() {
        return "Employee Name: " + name + ", ID: " + id;
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Type: Hourly, Rate: $" + hourlyRate +
               ", Hours Worked: " + hoursWorked + ", Pay: $" + (hourlyRate * hoursWorked);
    }
}


class SalariedEmployee extends Employee {
    double monthlySalary;

    SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Type: Salaried, Monthly Salary: $" + monthlySalary;
    }
}


public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("Alice", 101, 20.0, 160);
        Employee emp2 = new SalariedEmployee("Bob", 102, 5000.0);

        System.out.println(emp1.getEmployeeDetails()); 
        System.out.println(emp2.getEmployeeDetails());
    }
}
