package patient;

public class Patient extends Men
{
    ContactInformation inf;
    PhysicalCharacteristic phys;
    Patient(Birthday birthday,Name name, ContactInformation contactInformation,PhysicalCharacteristic physicalCharacteristic)
    {
        super( birthday, name);
        inf=contactInformation;
        phys=physicalCharacteristic;
contactInformation.displayInfoContactInformation();
physicalCharacteristic.displayInfoPhysicalCharacteristic();
}

}




