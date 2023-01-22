import java.util.Arrays;

public class Main {
    public static Employee[] employee = new Employee[10];


    public static void main(String[] args) {
        getAListOfAllEmployee();
        totalSalary();
        maxSalary();
        minSalary();
        printNameEmployee();
        average();
    }

    public static void getAListOfAllEmployee() {
        employee[0] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[1] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[2] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[3] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[4] = new Employee("Кирилл", 5, 20310, Employee.counter);
        for (Employee employee : employee) {
            System.out.println("el = " + employee);

        }
    }

    public static int totalSalary() {

        employee[0] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[1] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[2] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[3] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[4] = new Employee("Кирилл", 5, 20310, Employee.counter);
        employee[5] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[6] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[7] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[8] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[9] = new Employee("Кирилл", 5, 20310, Employee.counter);
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            total += employee[i].getSalary();
        }
        System.out.println("total = " + total);
        return total;
    }

    public static int maxSalary() {
        employee[0] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[1] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[2] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[3] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[4] = new Employee("Кирилл", 5, 20310, Employee.counter);
        employee[5] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[6] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[7] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[8] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[9] = new Employee("Кирилл", 5, 20310, Employee.counter);
        int max = employee[0].getSalary();

        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getSalary();
            if (max < salary && employee != null) {
                max = salary;
            }
        }
        System.out.println("max = " + max);
        return max;
    }

    public static void minSalary() {
        employee[0] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[1] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[2] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[3] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[4] = new Employee("Кирилл", 5, 20310, Employee.counter);
        employee[5] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[6] = new Employee("Кирилл", 2, 10, Employee.counter);
        employee[7] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[8] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[9] = new Employee("Кирилл", 5, 20310, Employee.counter);
        int min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getSalary();
            if (min > salary) {
                min = salary;
            }
        }
        System.out.println("min = " + min);
        System.out.println("employee.toString() = " + employee.toString());
        for (int j = 0; j < employee.length; j++) {
            System.out.println("employee[i].getName() = " + employee[j].getName());
        }
    }

    public static void printNameEmployee() {

        employee[0] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[1] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[2] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[3] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[4] = new Employee("Кирилл", 5, 20310, Employee.counter);
        employee[5] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[6] = new Employee("Кирилл", 2, 10, Employee.counter);
        employee[7] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[8] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[9] = new Employee("Кирилл", 5, 20310, Employee.counter);

        System.out.println("employee.toString() = " + employee.toString());
        for (int j = 0; j < employee.length; j++) {
            System.out.println("employee[i].getName() = " + employee[j].getName());
        }
    }

    public static void average() {
      double average = totalSalary()/employee[0].getCounter();
        System.out.println("average = " + average);
    }
}








