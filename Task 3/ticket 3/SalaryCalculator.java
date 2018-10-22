package task3;

public class SalaryCalculator {
    public static int sumOfEmployees;
    public static class sum{
        public static void sumsalary(int salary){
            sumOfEmployees += salary;
            System.out.println(sumOfEmployees);
        }
    }
    public static double averageMonthlySalary(int numberOfEmployees){
        double averageSalary = (double) sumOfEmployees/(double) numberOfEmployees;
        return averageSalary;
    }
}
