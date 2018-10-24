import java.util.Random;

public class IntGenerator {
    public static int getInt(int upperBound){
            Random rand = new Random();
        return (rand.nextInt(upperBound)+100);
    }
}
