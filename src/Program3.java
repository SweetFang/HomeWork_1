import java.util.Scanner;

public class Program3 {
    //Diamond
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter diamond length");
        int diamond;
        do {
            System.out.println("Value must be odd and grater then 3");
            diamond = scanner.nextInt();
        } while (diamond <= 3 || diamond % 2 == 0);
        int starCount = 1;
        int spaceCount = diamond / 2;
        do {
            for (int i = 0; i < spaceCount; i++) System.out.print(" ");
            for (int i = 0; i < starCount; i++) System.out.print("*");
            System.out.println("");
            spaceCount--;
            starCount += 2;
        } while (starCount <= diamond);
        starCount -= 2;
        spaceCount++;
        do {
            spaceCount++;
            starCount -= 2;
            for (int i = 0; i < spaceCount; i++) System.out.print(" ");
            for (int i = 0; i < starCount; i++) System.out.print("*");
            System.out.println("");
        } while (starCount > 1);
    }
}
