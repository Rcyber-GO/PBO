import java.util.GregorianCalendar;

public class Manager extends Employee {
    private String secretaryName;

    public Manager(String name, double salary, int day, int month, int year) {
        super(name, salary, day, month, year);
        secretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent) {
        int currentYear = new GregorianCalendar().get(GregorianCalendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }
}
