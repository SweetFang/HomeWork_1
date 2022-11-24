import java.util.Scanner;

//N times for Prime numbers
public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int FIRST_PRIME_NUMBER = 2;
        System.out.println("How many prime number would you like to see?");
        int amountOfPrimes;
        do {
            System.out.println("Please enter a positive number");
            amountOfPrimes = scanner.nextInt();

        } while (amountOfPrimes < 1);
        int number = FIRST_PRIME_NUMBER;
        boolean isPrime = true;

        do {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + ", ");
                amountOfPrimes--;
            }
            number++;
            isPrime = true;
        } while (amountOfPrimes >= 1);
        System.out.println();
    }

}
