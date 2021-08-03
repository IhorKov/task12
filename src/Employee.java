public class Employee implements Comparable<Employee> {

    static private int count;
    private String name;
    private String family;
    private Double salary;
    private int id;


    public Employee(String name, String family) {
        this.name = name;
        this.family = family;
        count++;
        id = count;
    }

    public Employee(String name, String family, double salary) {
        this(name, family);
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getId() < o.getId()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Имя сотрудника: " + this.getName() +
                "\nФамилия сотрудника: " + this.getFamily() +
                "\nЗарплата сотрудника: " + this.getSalary() + " грн.\n\n";


    }
}
