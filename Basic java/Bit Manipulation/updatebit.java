import java.util.Scanner;
public class updatebit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation(0 or 1): ");
        int oper=sc.nextInt();
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int newNumber;
        if(oper==1){
            newNumber=bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int notOfBitMask=~bitMask;
            newNumber=notOfBitMask & n;
            System.out.println(newNumber);
        }

    }
}
