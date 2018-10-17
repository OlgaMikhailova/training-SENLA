package task3;

public class SoftwareDeveloper extends Worker {
    public SoftwareDeveloper(int idname, String firstname, String lastname,int salary) {
        super(idname, firstname, lastname,salary);
        TotalMonthlySalary.sum.sumsalary(salary);
    }
}
