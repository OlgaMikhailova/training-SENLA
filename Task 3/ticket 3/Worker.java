package task3;

public class Worker {
    private int idname;
    private String firstname;
    private String lastname;
    private int salary;

    public Worker(int idname,String firstname, String lastname,int salary) {
        this.firstname = firstname;
        this.lastname =lastname;
        this.idname = idname;
        this.salary = salary;
    }

    public int getIdname()
    {
        return this.idname;
    }
    public void setIdname(int idname)
    {
        this.idname = idname;
    }
    public String getFirstname()
    {
        return this.firstname;
    }
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }
    public String getLastname()
    {
        return this.lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}
