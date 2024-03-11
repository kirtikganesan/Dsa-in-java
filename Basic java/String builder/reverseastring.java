import java.util.Scanner;
public class reverseastring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name=sc.nextLine();
        System.out.println("The entered string is: "+name);
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

    }
}
