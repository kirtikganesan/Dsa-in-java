import java.util.Scanner;
public class stringbasics{
    public static void main(String[] args) {
        // String firstname="Kirtik";
        // String fullname="Kirtik Ganesan";
        // String sentence="My name is Kirtik Ganesan";
        // System.out.println(firstname);
        // System.out.println(fullname);
        // System.out.println(sentence);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Your name is: "+name);
    }
}