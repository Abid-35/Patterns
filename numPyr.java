public class numPyr{
    public static void main(String[] args){
        System.out.println(" Numbers Pyramid ");
        int n = 5;
        for(int i = 1 ; i<=n;i++){
            for(int j =1 ; j<=n-i ; j++){//For spaces
                System.out.print("   ");
            }
            for(int j = 1 ; j<=i; j++){//For numbers
                System.out.print( i +"   ");
            }
            System.out.println("   ");
        }
    }
}