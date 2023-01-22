public class Employee {
    private final String name;
    private int department;
    private int salary;
    public static int counter = 0;
    public int id;



    public Employee(String name, int department, int salary, int id) {
        this.name = name;
        this.id = counter++;
        this.department = validateDepartment(department);
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

    public int getCounter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Имя='" + name + '\'' +
                ", Депортамент=" + department +
                ", Зарплата=" + salary +
                ", id=" + id +
                '}';
    }

    public int   validateDepartment(int department) {
        return this.department <1 || this.department > 5 ? 1: this.department;
    }
}




