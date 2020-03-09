import Staff.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Company extends Comparator1 {

    private double income;
    private ArrayList<Employee> staff = new ArrayList<Employee>();

    public Company(double income){
        this.income = income;
    }
    public List<Employee> sendList(){
        return staff;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public double getIncome(){
        return income;
    }

    public int getCountStaff(){
        return staff.size();
    }

    public void hire(Employee staff){
        this.staff.add(staff);
    }
    public void hireAll(ArrayList<Employee> staff){
        this.staff.addAll(staff);
    }
    public void fire(int fireStaff){
        this.staff.remove(fireStaff);
    }

//    public List<Employee> getTopSalaryStaff(int count){
//       int item = 0;
//        if (count > staff.size()){
//            item = staff.size();
//        }else item = count;
//        ArrayList<Employee> newArrList = new ArrayList<Employee>(staff);
//        return newArrList.subList(0, item);
//    }
//    public List<Employee> getLowSalaryStaff(int count){
//        int item = 0;
//        if (count > staff.size()){
//            item = staff.size();
//        }else item = count;
//        ArrayList<Employee> newArrList = new ArrayList<Employee>(staff);
//        newArrList.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if (o1.getMonthSalary() > o2.getMonthSalary()){
//                    return 1;
//                }
//                if (o1.getMonthSalary() < o2.getMonthSalary()){
//                    return -1;
//                }
//                return 0;
//            }
//        });
//        return newArrList.subList(0, item);
//    }
}
