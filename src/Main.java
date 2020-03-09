import Staff.Employee;
import Staff.Manager;
import Staff.Operator;
import Staff.TopManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company apple = new Company(40_000_000);

        for (int i = 0; i < 180; i++){
            apple.hire(new Operator());
        }
        for (int i = 0; i < 80; i++){
            apple.hire(new Manager(apple.getIncome()));
        }
        for (int i = 0; i < 10; i++){
            apple.hire(new TopManager(apple.getIncome()));
        }

        System.out.println(apple.getCountStaff());

        List<Employee> newStaff = new ArrayList<Employee>(apple.sendList());

        System.out.println("Top salary ");
        for (Employee e : apple.getTopSalaryStaff(newStaff,13){
            System.out.println(e.getMonthSalary());
        }
        System.out.println("Low salary ");
        for (Employee e : apple.getLowSalaryStaff(30)){
            System.out.println(e.getMonthSalary());
        }

        int count = apple.getCountStaff()/2;
        for (int i = 0; i < count; i++){
            apple.fire(i);
        }
        System.out.println(apple.getCountStaff());
        System.out.println("Top salary ");
        for (Employee e : apple.getTopSalaryStaff(13)){
            System.out.println(e.getMonthSalary());
        }
        System.out.println("Low salary ");
        for (Employee e : apple.getLowSalaryStaff(30)){
            System.out.println(e.getMonthSalary());
        }

    }
}
