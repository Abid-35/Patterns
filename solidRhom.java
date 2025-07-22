public class solidRhom{
    public static void main(String[] args) {
    System.out.println("Solid Rhombus");
    int n= 5;
    for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<=n-i ; j++){ //For Spaces
            System.out.print("   ");
        }
        for(int j = 1; j<=n; j++){ //For Stars
            System.out.print(" * ");
        }
        System.out.println("   ");
    }        
    }}
