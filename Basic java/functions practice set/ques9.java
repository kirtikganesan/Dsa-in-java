import java.util.Scanner;

public class ques9 {
    public static void gcdCalculator(int a,int b){
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.format("The gcd of %d and %d is %d",a,b,gcd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        gcdCalculator(a, b);
    }
}
