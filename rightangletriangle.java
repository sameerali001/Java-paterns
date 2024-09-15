import java.util.*;
public class rightangletriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        for(int i=1; i<=a;i++){
            //for colomn
            for(int j=1;j<=i;j++){
                //for row
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
