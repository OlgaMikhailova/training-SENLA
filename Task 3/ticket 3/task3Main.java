package task3;

public class task3Main {
    public static void main(String[] args){
        Worker[] company1;
        company1 = createWorker();
        int workerLength = company1.length;
        double averageSalary = SalaryCalculator.averageMonthlySalary(workerLength);
        System.out.printf("Average monthly salary in the company "+averageSalary);
    }
    public static Worker[] createWorker(){
        Worker[] company = {new BusinessAnalyst(23,"Anna","Lench",40),new SoftwareDeveloper(45,"Ivan","Ivanov",24),new SoftwareDeveloper(46,"Aleksey","Alekseev",44),new Tester(67,"Den","Shok",25), new Tester(69,"Lana","Lomteva",35)};
        return company;
    }
}