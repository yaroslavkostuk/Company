package Staff;

import Staff.Employee;

public class Manager implements Employee {

    double salaryManager;
    private double income;

    public Manager(double income){
        this.income = income;
    }
    public void setIncome(double income){
        this.income = income;
    }

    @Override
    public double getMonthSalary() {
        salaryManager = 40_000;
        if(income != income){
            return salaryManager * 0.5;
        } else
            return salaryManager;
    }

}
