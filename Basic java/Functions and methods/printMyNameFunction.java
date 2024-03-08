import java.util.Scanner;
public class printMyNameFunction{
    public static void printMyName(String name){
        System.out.println("Good Morning "+name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        printMyName(name);
    }
}