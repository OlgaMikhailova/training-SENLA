package task3;

public class task3Main {
    public static void main(String[] args){
        Worker[] company1;
        company1= createWorker();
        int workerLength =company1.length;
        double averageSalary=TotalMonthlySalary.averageMonthlySalary(workerLength);
        System.out.printf("Average monthly salary in the company "+averageSalary);
    }
    public static Worker[] createWorker(){
        BusinessAnalyst worker1 = new BusinessAnalyst(23,"Anna","Lench",34);
        SoftwareDeveloper worker2 = new SoftwareDeveloper(45,"Ivan","Ivanov",24);
        SoftwareDeveloper worker3 = new SoftwareDeveloper(46,"Aleksey","Alekseev",44);
        Tester worker4 = new Tester(67,"Den","Shok",25);
        Tester worker5 = new Tester(69,"Lana","Lomteva",35);
        Worker[] company={worker1,worker2,worker3,worker4,worker5};
        return company;
    }
}