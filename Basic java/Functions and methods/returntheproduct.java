import java.util.Scanner;

public class returntheproduct {
    public static int calculateProduct(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        int product=calculateProduct(a, b);
        System.out.println("The product is: "+product);

    }
}
