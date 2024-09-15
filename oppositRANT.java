import java.util.*;
 class oppositRANT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
        // int b = sc.nextInt();
        for(int i=a; i>=1;i--){
            //for colomn
            for(int j=1;j<=i;j++){
                //for row
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
