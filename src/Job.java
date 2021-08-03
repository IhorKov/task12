import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Job {
    public static void main(String[] args) {

        EmployeeBySalaryComparator salaryComparator = new EmployeeBySalaryComparator();
        EmployeeBySalaryComparator salaryAndNameComparator = new EmployeeBySalaryAndNameComparator();

        Employee employeeOne = new Employee("Ivan", "Vetrov", 20000);
        Employee employeeTwo = new Employee("Nickolay", "Petrov",13000);
        Employee employeeThree = new Employee("Petr", "Zhmishenko", 14000);
        Employee employeeFour = new Employee("Aleksey", "Senicyin", 20000);
        Employee employeeFive = new Employee("Kirill", "Dovgoluk", 14000);

        List<Employee> list = new ArrayList<>();
        list.add(employeeFour);
        list.add(employeeThree);
        list.add(employeeTwo);
        list.add(employeeOne);
        list.add(employeeFive);

        System.out.println(list);

        Collections.sort(list);

        System.out.println("\n!!!AFTER ID's SORT!!!\n");

        System.out.println(list);

        Collections.sort(list, salaryComparator);

        System.out.println("\n!!!AFTER SALARY's SORT!!!\n");

        System.out.println(list);

        Collections.sort(list, salaryAndNameComparator);

        System.out.println("\n!!!AFTER SALARY's & NAME's SORT!!!\n");

        System.out.println(list);
    }


}
