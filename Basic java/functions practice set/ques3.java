import java.util.Scanner;

public class ques3 {
    public static void greaterOfTwoNumbers(int a,int b){
        if(a>b){
            System.out.format("The greatest of both the numbers is %d",a);
        }
        else if(b>a){
            System.out.format("The greatest of both the numbers is %d",b);
        }
        else{
            System.out.format("Both the numbers are equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        greaterOfTwoNumbers(a, b);
    }
}
