public class DiamondSatrPattern {
    public static void main(String[] args) {
        int n=4;

        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            int star=2*i-1;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            int star=2*i-1;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
