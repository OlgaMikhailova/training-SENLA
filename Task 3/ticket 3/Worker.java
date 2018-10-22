package task3;

public  abstract class Worker {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Worker(int id,String firstName, String lastName,int salary) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.id = id;
        this.salary = salary;
        SalaryCalculator.sum.sumsalary(salary);
    }

    public int getid() {
        return this.id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getfirstName() {
        return this.firstName;
    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getlastName() {
        return this.lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {

        this.salary = salary;
    }
}
