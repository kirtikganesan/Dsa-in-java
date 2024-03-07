public class advancedpattern1 {
    public static void main(String[] args) {
        int n=4;
        int m=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=8;j++){
                if(j==1 || j==m){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
