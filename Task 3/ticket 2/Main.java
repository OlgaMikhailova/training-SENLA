public class Main {
    public static final int UPPER_BOUND_RANDOM = 1000;
    
    public static void main(String[] args){
        int first = IntGenerator.getInt(UPPER_BOUND_RANDOM);
        int second = IntGenerator.getInt(UPPER_BOUND_RANDOM);
        int firstsecond = MathHelper.ConcatInt(first,second);
        int third = IntGenerator.getInt(UPPER_BOUND_RANDOM);
        int result = MathHelper.Subtraction(firstsecond,third);
        System.out.printf("first number = "+ first + "\n" + "second number = " + second + "\n" + "concatenation " + firstsecond + "\n" + "third = " + third + "\n" + "result = " + result);
    }
}
