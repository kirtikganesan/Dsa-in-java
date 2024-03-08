import java.util.Scanner;

public class ques4 {
    public static void calculateCircumference(float r){
        float circumference=2*3.14f*r;
        System.out.println("The circumference of the circle is: "+circumference);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r=sc.nextFloat();
        calculateCircumference(r);
    }
}
