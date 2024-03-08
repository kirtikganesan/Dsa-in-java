import java.lang.Math;
import java.util.Scanner;
public class ques8{
    public static void powerFunction(double x,int n){
        double power=Math.pow(x,n);
        System.out.println("The value of x raised to n is: "+power);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x: ");
        double x=sc.nextDouble();
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        powerFunction(x, n);
    }
}