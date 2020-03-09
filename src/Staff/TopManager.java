package Staff;

public class TopManager implements Employee {

    private double topManagerSalary;
    private double income;


    public TopManager(double income){
        this.income = income;
    }
    public void setIncome(double income){
        this.income = income;
    }

    @Override
    public double getMonthSalary() {

        if (income > 10_000_000)
        {
            topManagerSalary = 65_000 + 1.5 * 60_000;
            return topManagerSalary;
        } else {
            topManagerSalary = 65_000;
            return topManagerSalary;
        }
    }
}
