public class butterFly{
    public static void main(String[] args){
        int n = 4;
        // For the Upper Part
        for(int i = 1; i<= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" * ");
            }
            for(int j = 1; j <= 2*(n-i) ;j++){
                System.out.print("   "); 
            }
            for(int j = 1 ; j<=i ;  j++){
                System.out.print(" * ");
            }
            System.out.println("   ");
        }
        // For the Lower Part
        for(int i = n; i>= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" * ");
            }
            for(int j = 1; j <= 2*(n-i) ;j++){
                System.out.print("   "); 
            }
            for(int j = 1 ; j<=i ;  j++){
                System.out.print(" * ");
            }
            System.out.println("   ");
        }

    }
}