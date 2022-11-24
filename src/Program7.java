
// Narcissist numbers up to 1000
public class Program7 {
    public static void main(String[] args) {
        int numberLength, digit, underTest, sum, power;
        for (int theNumber = 0; theNumber <= 1000; theNumber++) {
            underTest = theNumber;
            numberLength = 0;
            while (underTest >= 1) {
                numberLength++;
                underTest /= 10;
            }
            underTest = theNumber;
            sum = 0;
            while (underTest >= 1) {
                digit = underTest % 10;
                power = digit;
                for (int i = 1; i < numberLength; i++) power *= digit;
                sum += power;
                underTest /= 10;
            }
            if (sum == theNumber) System.out.print(theNumber + ",");
        }
    }
}
