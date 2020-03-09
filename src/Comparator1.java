import Staff.Employee;

import java.util.ArrayList;
import java.util.List;

abstract class Comparator1
{
    public List<Employee> getTopSalaryStaff(List<Employee> list,int count){

        list.sort(new java.util.Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getMonthSalary() > o2.getMonthSalary()){
                    return -1;
                }
                if (o1.getMonthSalary() < o2.getMonthSalary()){
                    return 1;
                }
                return 0;
            }
        });
        return list.subList(0, count);
    }
    public List<Employee> getLowSalaryStaff(List<Employee> list){

        list.sort(new java.util.Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getMonthSalary() > o2.getMonthSalary()){
                    return 1;
                }
                if (o1.getMonthSalary() < o2.getMonthSalary()){
                    return -1;
                }
                return 0;
            }
        });
        return list;
    }

}
