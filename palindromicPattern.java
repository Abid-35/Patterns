public class palindromicPattern{
    public static void main(String[] agrs){
        System.out.println(" Palindromic  Patterns ");
        int n = 4;
        for(int i = 1;  i<=n; i++){
            for(int j =1 ; j<=n-i ; j++){//For Spaces
                System.out.print(" ");
            }
            for(int j = i ;  j>=1 ; j--){ //For 1st  part of numbers (backward Loop)
                System.out.print(j);
            }
            for(int j = 2  ; j<= i  ; j++){ //For 2nd  part of numbers (forward Loop)
                System.out.print(j);
            }
            System.out.println();

        }
    }
}