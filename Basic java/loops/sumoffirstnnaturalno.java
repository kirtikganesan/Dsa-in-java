import java.util.Scanner;
public class sumoffirstnnaturalno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("The sum is: "+sum);
    }
}
