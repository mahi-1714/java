
abstract class Employee {
    
    private int id;
    private String name;

    
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    abstract double calculateSalary();

    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}


class FullTimeEmployee extends Employee {
    private double monthlySalary;

    
    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    
    
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    
    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}


public class OOPDemo {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(101, "Rahul", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Priya", 120, 250);

        
        Employee employees[] = {emp1, emp2};

        for (Employee emp : employees) {
            emp.display();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("-------------------------");
        }
    }
}
