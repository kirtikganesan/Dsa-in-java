import java.util.Scanner;

public class arraybasicques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(array[i]==65){
                System.out.println("Found at index: "+i);
                return;
            }
        }
    }
}
