package patient;

public class ContactInformation
{
    private String email;
    private int phone;

    public ContactInformation(String email, int phone) {
        this.phone=phone;
        this.email=email;
    }

    public int getPhone()
    {
        return this.phone;
    }
public void setPhone(int phone){
        this.phone=phone;
}
public String getEmail(){return this.email;}
public void setEmail(String email){this.email=email;}
    public void displayInfoContactInformation() {
        System.out.printf("Contact_information :   \tphone: %d \temail:%s  \n",getPhone(),getEmail());
    }
}
