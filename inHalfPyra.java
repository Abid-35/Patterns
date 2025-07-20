public class inHalfPyra{
    public static  void main(String[] args){
      System.out.println("Inverted Half Pyramid");
      int n = 4;
      for(int i = 1 ; i<=n ; i++){
        for(int j =n; j>=i ; j--){
            System.out.print(" * ");
        }
        System.out.println("   ");
      }

    }
}