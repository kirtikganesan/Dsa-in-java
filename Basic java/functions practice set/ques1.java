import java.util.Scanner;

public class ques1{
    public static void calculateAverage(float a,float b,float c){
        float avg=(a+b+c)/3;
        System.out.println("The average of all 3 no.s is: "+avg);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        float a=sc.nextFloat();
        System.out.println("Enter b: ");
        float b=sc.nextFloat();
        System.out.println("Enter c: ");
        float c=sc.nextFloat();
        calculateAverage(a, b, c);
    }
}