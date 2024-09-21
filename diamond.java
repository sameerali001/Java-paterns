public class diamond {
    public static void main(String[] args){
        int n=10;
        //frist half
        for(int i=1;i<=n;i++){
            //spaces
            int spaces=n-i;
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");

        }
     
        for(int j=1;j<=i;j++){
            System.out.print("*"+ " ");
        }
        System.out.println();
        }
        // second half
        for(int i=n;i>=1;i--){
            //spaces
            int spaces=n-i;
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");

        }
     
        for(int j=1;j<=i;j++){
            System.out.print("*"+ " ");
        }
        System.out.println();
        }
    }
    
}
