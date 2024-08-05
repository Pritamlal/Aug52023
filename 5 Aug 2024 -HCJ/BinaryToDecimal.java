import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        final int BASE = 2;
        long binary, decimal = 0, tempBinary;
        int N = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number: ");
        binary = sc.nextLong();

        tempBinary = binary;

        while (tempBinary != 0) {
            // If the current binary digit is 1
            if (tempBinary % 10 == 1) {
                decimal += Math.pow(BASE, N);
            }

            N++;
            tempBinary /= 10;
        }

        System.out.println("Binary number = " + binary);
        System.out.println("Decimal number = " + decimal);

        sc.close();
    }
}

