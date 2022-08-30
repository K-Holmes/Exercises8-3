public class Calculator {
    public int add(int x, int y){
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        int result;
        try {
            result = x/y;
        }
        catch (ArithmeticException e) {
            System.out.println("Error, can't divide by 0");
            result=0;
        }
        return result;
    }
}
