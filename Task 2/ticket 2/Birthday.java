package patient;

public class Birthday {
        private int month;
        private int number;
        private int year;

    public Birthday(int number,int month,int year)
    {
        this.year=year;
        this.month=month;
        this.number=number;
    }
public int getMonth(){return this.month;}
public int getNumber(){return this.number;}
public int getYear(){return this.year;}
    public void setMonth(int month)
    {
        this.month = month;
    }
    public void setNumber(int number){this.number=number;}
    public void setYear(int year)
    {
        this.year = year;
    }
    public void displayInfoBirthday ()
    {
        System.out.printf("Birthday:  \tNumber: %d\t Month: %d\t Year: %d\n", getNumber(), getMonth(), getYear());
    }
}
