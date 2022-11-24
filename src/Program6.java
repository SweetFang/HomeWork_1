import java.util.Scanner;

//sum of digits
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a multi digit number");
        int userNumber = scanner.nextInt();
        int sumOfDigits = 0;
        do {
            sumOfDigits += userNumber % 10;
            userNumber /= 10;
        } while (userNumber >= 1);
        System.out.println("The sum of digits is " + sumOfDigits);
    }
}
