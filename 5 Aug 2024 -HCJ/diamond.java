import java.util.Scanner;

public class diamond {
    public static void main(String[] args){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j< (2*i);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=num-1;i>0;i--){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<(2*i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
