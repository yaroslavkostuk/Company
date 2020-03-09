package Staff;

import Staff.Employee;

public class Operator implements Employee {

    @Override
    public double getMonthSalary() {
        return 30_000;
    }
}