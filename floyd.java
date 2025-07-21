public class floyd{
    public static void main(String[] args) {
    System.out.println("Floyd's Triangle ");
    int n= 4;
    int number = 1;
    for (int i = 0; i <= n; i++) {
        for(int j = 1 ; j<= i ; j++){
            System.out.print(" "+ number + " ");
            number++;
        }
        System.out.println("   ");
        
    }       
    }}
