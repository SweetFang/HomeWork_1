import java.util.Scanner;

//Series Of Numbers
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st element");
        int firstElem = scanner.nextInt();
        System.out.println("Enter step size");
        int stepSize = scanner.nextInt();
        int elemAmount;
        do {
            System.out.println("Enter amount of elements");
            elemAmount = scanner.nextInt();
        } while (elemAmount < 0 );
        for (int i = elemAmount; i > 0; i--) {
            System.out.print(firstElem + ", ");
            firstElem += stepSize;
        }
    }
}
