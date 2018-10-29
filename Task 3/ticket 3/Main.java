import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Worker> company =  createWorker();
        double sumSalary = SalaryCalculator.SumSalary(company);
        double averageSalary = SalaryCalculator.AverageMonthlySalary(company.size(),sumSalary);
        System.out.printf("Average monthly salary in the company " + averageSalary);
    }

    public static List<Worker> createWorker(){
        List<Worker> company = new ArrayList<>();
        company.add(new BusinessAnalyst(23,"Anna","Lench",40));
        company.add(new SoftwareDeveloper(45,"Ivan","Ivanov",24));
        company.add(new SoftwareDeveloper(46,"Aleksey","Alekseev",44));
        company.add(new Tester(67,"Den","Shok",25));
        company.add(new Tester(69,"Lana","Lomteva",35));
        return company;
    }
}
