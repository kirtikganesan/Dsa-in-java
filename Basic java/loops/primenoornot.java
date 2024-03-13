import java.util.Scanner;
public class primenoornot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        

        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(n==1 || n==0){
            System.out.println("Neither prime nor composite!!");
        }
        else if(isPrime){
            System.out.println("It is a prime number!!");
        }
        else{
            System.out.println("It is not a prime number!!");
        }

    }
}