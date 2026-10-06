public class Employee extends Sortable {
    private final String name;
    private double salary;
    private final int hireDay;
    private final int hireMonth;
    private final int hireYear;

    public Employee(String name, double salary, int day, int month, int year) {
        this.name = name;
        this.salary = salary;
        hireDay = day;
        hireMonth = month;
        hireYear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireYear;
    }

    @Override
    public int compare(Sortable other) {
        Employee employee = (Employee) other;
        return Double.compare(salary, employee.salary);
    }
}
