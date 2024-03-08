import java.util.*;
public class ques5 {
    public static void eligibilityToVote(int age){
        if(age>=18 && age<110){
            System.out.println("You are eligible to vote!!");
        }
        else if(age>0 && age<18){
            System.out.println("You cannot vote!");
        }
        else{
            System.out.println("Invalid Age!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        eligibilityToVote(age);

    }
}
