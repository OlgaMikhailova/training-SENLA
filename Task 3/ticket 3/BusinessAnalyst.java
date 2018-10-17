package task3;

public class BusinessAnalyst extends Worker {

    public BusinessAnalyst(int idname, String firstname, String lastname,int salary) {
        super(idname, firstname, lastname,salary);
        TotalMonthlySalary.sum.sumsalary(salary);
    }
}
