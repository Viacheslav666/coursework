import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        book();
        totalSalary();
        maxSalary();
        minSalary();

    }

    public static void book() {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[1] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[2] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[3] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[4] = new Employee("Кирилл", 5, 20310, Employee.counter);
        for (Employee el : employee) {
            System.out.println("el = " + el);
        }


    }

    public static void totalSalary() {
        Employee[] employee = new Employee[10];
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
        double averag;
        for (int i = 0; i < employee.length; i++) {
            total += employee[i].getSalary();
        }
        averag = total / employee.length;
        System.out.println("averag = " + averag);
        System.out.println("total = " + total);
    }

    public static int maxSalary() {
        Employee[] employee = new Employee[10];
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
            if (max < employee[i].getSalary()) {
                max = employee[i].getSalary();
            }
        }
        System.out.println("max = " + max);
        return max;
    }

    public static void minSalary() {
        Employee[] employee = new Employee[10];
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
            if (min > employee[i].getSalary()) {
                min = employee[i].getSalary();
            }
        }
        System.out.println("min = " + min);
        System.out.println("employee.toString() = " + employee.toString());
        for (int j = 0; j < employee.length; j++){
            System.out.println("employee[i].getName() = " + employee[j].getName());
        }
    }

}


//public static String printAllContacts() {
//    for (int i = 0; i <; i++) {
//        Employee employee = ;
//        System.out.println(employee.getName() + ": " + employee.getSalary());





