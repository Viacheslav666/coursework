import java.lang.reflect.Array;

public class Employee {
    private final String name;
    private int department;
    private int salary;
    public static int counter = 0;
    private int id;

    public Employee(String name, int department, int salary, int id) {
        this.name = name;
        this.id = counter++;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {

        return  "Имя " + this.name;

    }

    public int salaryAmount() {
        int sum = 0;
        for (int i = 0; i < getSalary(); i++) {
            sum += getSalary();
        }
        return sum;
    }

        }




