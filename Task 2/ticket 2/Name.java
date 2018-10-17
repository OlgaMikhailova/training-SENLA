package patient;

public class Name {

        private int idname;
        private String firstname;
        private String middlename;
        private String lastname;

    public Name(int idname,String firstname,String middlename,String lastname) {
        this.firstname =firstname;
        this.middlename =middlename;
        this.lastname =lastname;
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

    public String getMiddlename()
    {
        return this.middlename;
    }
    public void setMiddlename(String middlename)
    {
        this.middlename = middlename;
    }
    public String getLastname()
    {
        return this.lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    public int getIdname()
    {
        return this.idname;
    }
    public void setIdname(int idname)
    {
            this.idname = idname;
    }

    public void displayInfoName() {
        System.out.printf("Name:   \tIDName: %d \tFirstname:%s  \t Middlename:%s  \tLastname: %s\n", getIdname(), getFirstname(), getMiddlename(), getLastname());
    }
}

