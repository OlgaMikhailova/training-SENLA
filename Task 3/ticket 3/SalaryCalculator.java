import java.util.List;

public class SalaryCalculator {
    public  static double SumSalary(List<Worker> workerList){
        double sumSalary = 0;
        for (Worker worker : workerList){
            sumSalary += worker.getSalary();
        }
        return sumSalary;
    }
    public static double AverageMonthlySalary(int numberOfEmployees, double sumSalary){
        return  sumSalary/(double) numberOfEmployees;
    }
}
