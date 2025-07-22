public class diamondPattern{
 public static void main(String[] args) {
     System.out.println(" Diamond Pattern ");
     int n   = 4;
     //Upper Part
     for(int i = 1 ; i<=n; i++){
      for(int j = 1 ; j<= n-i ; j++){//For Spaces
        System.out.print("   ");
      }
      for(int j = 1 ; j<=(2*i)-1;j++){//For Stars
        System.out.print(" * ");
      }
      System.out.println("   ");
     }
     //Lower Part
     for(int i = n ; i>=1; i--){
      for(int j = 1 ; j<= n-i ; j++){//For Spaces
        System.out.print("   ");
      }
      for(int j = 1 ; j<=(2*i)-1;j++){//For Stars
        System.out.print(" * ");
      }
      System.out.println("   ");
     }
 }
}