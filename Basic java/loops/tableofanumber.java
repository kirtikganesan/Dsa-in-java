import java.util.Scanner;
public class tableofanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",n,i,n*i);
        }
    }
}
