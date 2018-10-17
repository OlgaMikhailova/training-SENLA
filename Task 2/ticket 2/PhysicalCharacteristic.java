package patient;

public class PhysicalCharacteristic
{
   private float weight;
   private float height;

    public PhysicalCharacteristic(float weight,float height) {
        this.weight=weight;
        this.height=height;
    }
    public float getWeight()
    {
        return this.weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getHeight()
    {
        return this.height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public void displayInfoPhysicalCharacteristic() {
        System.out.printf("Physical characteristic:  \tHeight: %.2f\t Weight: %.1f\n",getHeight(),getWeight());
    }
}
