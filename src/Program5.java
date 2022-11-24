import java.util.Scanner;

//find if user number is Fibonacci's
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int INITIAL_VALUE_0 = 0;
        final int INITIAL_VALUE_1 = 1;
        int lastValue0 = INITIAL_VALUE_0;
        int lastValue1 = INITIAL_VALUE_1;
        int nextValue = INITIAL_VALUE_0;
        System.out.println("Enter a number to test for Fibonacci's");
        int numberToTest = scanner.nextInt();
        boolean isFibonacci = false;
        do {
            if (numberToTest == nextValue) isFibonacci = true;
            nextValue = lastValue0 + lastValue1;
            lastValue0 = lastValue1;
            lastValue1 = nextValue;
        } while (nextValue <= numberToTest);
        System.out.print("the number " + numberToTest + " is ");
        if (!isFibonacci) System.out.print("not ");
        System.out.println("a Fibonacci number.");
    }
}
