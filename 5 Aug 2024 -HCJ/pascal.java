import java.util.Scanner;

public class pascal{
    public static void main(String[] args){
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number::");
        num = sc.nextInt();

        int triangle[][] = new int [num][num];
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    triangle[i][j] = 1;
                }else{
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
                System.out.println(triangle[i][j]+ " ");
            }
            System.out.println();
        }
    }
}