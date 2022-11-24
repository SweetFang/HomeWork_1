import java.util.Scanner;

// Quadratic Solution
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 coefficient of the quadratic equation");
        int coefA = scanner.nextInt();
        int coefB = scanner.nextInt();
        int coefC = scanner.nextInt();
        int rootInert = (coefB * coefB) - (4 * coefA * coefC);
        if (rootInert == 0) System.out.println("The equation have only 1 solution: X=" + (-coefB) / (2 * coefA));
        else if (rootInert > 0) {
            System.out.println("The equation have 2 solutions:");
            System.out.println("X1=" + ((-coefB) + rootInert) / (2 * coefA));
            System.out.println("X2=" + ((-coefB) - rootInert) / (2 * coefA));
        } else System.out.println("The equation has no solutions");
    }
}
