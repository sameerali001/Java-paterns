import java.util.*;;
public class floyd_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 1;
        for(int i = 1 ; i<=a;i++){
            for(int j =1; j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    
}
