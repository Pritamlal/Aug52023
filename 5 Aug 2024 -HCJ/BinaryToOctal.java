import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = sc.nextLine();
        
        // Convert binary string to a decimal integer
        int decimal = Integer.parseInt(binaryStr, 2);
        
        // Convert decimal integer to an octal string
        String octalStr = Integer.toOctalString(decimal);
        
        System.out.println("The octal equivalent is: " + octalStr);
        sc.close();
    }
}
