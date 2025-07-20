import java.util.Scanner;
public class halfPyra{
    public static void main(String[] args){
        System.out.println("Half Pyramid");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no . of Rows :");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(" * ");
            
            }
            System.out.println("   ");
        }

    }
}