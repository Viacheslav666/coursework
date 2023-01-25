import java.util.Arrays;

public class Main {
    public static Employee[] employee = new Employee[10];


    public static void main(String[] args) {
        employee[0] = new Employee("Василий", 1, 150_000, Employee.counter);
        employee[1] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[2] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[3] = new Employee("Вася", 4, 20120, Employee.counter);
        employee[4] = new Employee("Кирилл", 5, 20310, Employee.counter);
        employee[5] = new Employee("Василий", 2, 150_000, Employee.counter);
        employee[6] = new Employee("Кирилл", 2, 200, Employee.counter);
        employee[7] = new Employee("Петя", 3, 20222, Employee.counter);
        employee[8] = new Employee("Вася", 1, 20120, Employee.counter);
        employee[9] = new Employee("Кирилл", 5, 20310, Employee.counter);
        getAListOfAllEmployee();
        System.out.println("total = " + totalSalary());
        maxSalary();
        minSalary();
        printNameEmployee();
        average();
        indexing(10);
        System.out.println("getAMaximumWageEmployee(2) = " + getAMaximumWageEmployee(3));
        System.out.println("findTheAverageSalaryByDepartment(1) = " + findTheAverageSalaryByDepartment(3));

    }

    public static void getAListOfAllEmployee() {
        for (Employee employee : employee) {
            System.out.println("el = " + employee);

        }
    }

    public static int totalSalary() {
        int total = 0;
        int y = 0;

        for (int i = 0; i < employee.length; i++) {
            total += employee[i].getSalary();
            y++;
        }
        return total;
    }

    public static int maxSalary() {
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
        int min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getSalary();
            if (min > salary && employee != null) {
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
        System.out.println("employee.toString() = " + employee.toString());
        for (int j = 0; j < employee.length; j++) {
            System.out.println("employee[i].getName() = " + employee[j].getName());
        }
    }

    public static int average() {
        double total = 0;
        int y = 0;

        for (int i = 0; i < employee.length; i++) {
            total += employee[i].getSalary();
            y++;
        }
        double average = total / y;
        System.out.println("average = " + average);
        return (int) average;
    }

    public static void indexing(int percent) {
        for (Employee employee : employee) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            System.out.println(employee.getName() + " employee.getSalary() = " + employee.getSalary());
        }
    }

    public static Employee getAMaximumWageEmployee(int deportament) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employee) {
            if (employee.getDepartment() != deportament) {
                continue;
            }
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee getAMinimumWageEmployee(int Department) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employee) {
            if (employee.getDepartment() != Department) {
                continue;
            }
            if (minSalary < employee.getSalary()) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static int totalSalaryOfTheDepartment(int department) {
        int sum = 0;
        for (Employee employee : employee) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static double findTheAverageSalaryByDepartment(int department) {
        double sum = 0;
        int counter = 0;
        double average = 0;
        for (Employee employee : employee) {
            if(employee!=null&& employee.getDepartment() == department){
                sum+=employee.getSalary();
                counter++;
                average = sum/counter;
            }

        }
        return average;
    }

}








