import java.util.Scanner;
public class ques2 {
    public static void sumOfOddNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.format("The sum of all odd numbers from 1 to %d is: %d",n,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        sumOfOddNumbers(n);
    }
}
