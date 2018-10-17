package task3;

public class Tester extends Worker {
    public Tester(int idname, String firstname, String lastname,int salary) {
        super(idname, firstname, lastname,salary);
        TotalMonthlySalary.sum.sumsalary(salary);
    }
}
