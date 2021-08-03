public class EmployeeBySalaryAndNameComparator extends EmployeeBySalaryComparator{

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() < o2.getSalary()) {
            return 1;
        }
        else if (o1.getSalary() > o2.getSalary()){
            return -1;
        }
        else if(o1.getSalary() ==  o1.getSalary()){
            return o1.getName().compareTo(o2.getName());
        }
        return 0;
    }
}
