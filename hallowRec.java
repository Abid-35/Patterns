
import java.util.Scanner;

public class hallowRec{
    public static void main(String[] args) {
        System.out.println("Hallow Rectangle");
        Scanner rows = new Scanner(System.in);
        Scanner columns = new Scanner(System.in);
        System.out.println("Enter the no.of rows : ");
        int n = rows.nextInt();
        System.out.println("Enter the no.of columns : ");
        int m = columns.nextInt();
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j <=m ; j++){
                if(i==1||j==1||i==n||j==m){
                System.out.print(" * ");
                }
                else{
                System.out.print("   ");
                }
            }
            System.out.println(" ");

        }

        
    }}
