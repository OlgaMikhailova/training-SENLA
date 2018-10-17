package patient;

public class Main {
    public static void main(String[] args){
        Patient patient1;
        Name name= new Name(214,"Ivan","Ivanovich","Ivanov");
        Birthday birthday= new Birthday(23,02,1987);
        ContactInformation contactInformationnformation=new ContactInformation("wer@gmail",2345);
        PhysicalCharacteristic physicalCharacteristic=new PhysicalCharacteristic(75.2f, 1.8f);
        Patient patient = new Patient(birthday ,name, contactInformation, physicalCharacteristic);
        patient1=patient;
        patient.sleep();
        patient.eat();
    }
}
