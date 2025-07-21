public class roHalfPyra{
    public static void main(String[] args){
        int n = 4; 
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ;  j <= n-i ; j++){  // To print the Spaces
                System.out.print("   ");
            }
            for(int j = 1 ;  j <= i ; j++){  // To print the Stars
                System.out.print(" * ");
            }
            System.out.println("   ");
        }
    }
}