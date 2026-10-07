public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        for (Employee employee : staff) {
            employee.raiseSalary(5);
        }

        for (Employee employee : staff) {
            employee.print();
        }

        System.out.println(staff[0].compare(staff[1]));
        System.out.println(staff[1].compare(staff[2]));
        System.out.println(staff[2].compare(staff[0]));

        Manager manager = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        Employee employee = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        System.out.println(manager.compare(employee));
    }
}