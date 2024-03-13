import java.util.Arrays;
import java.util.Scanner;


public class swapelementsinanarray {
    public static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter index 1: ");
        int index1=sc.nextInt();
        System.out.println("Enter index 2: ");
        int index2=sc.nextInt();
        swap(arr,index1,index2);
        System.out.println(Arrays.toString(arr));
    }
}
