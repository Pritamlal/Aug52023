import java.util.Scanner;

public class square {
    public static void main(String[] args){
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number::");
        num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1 || j==num || i==num || i==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
           
        }
    }    
}
