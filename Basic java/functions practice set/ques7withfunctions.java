import java.util.Scanner;
public class ques7withfunctions {
public static void countOfNumbers(){
    int positiveNumberCount=0;
    int negativeNumberCount=0;
    int zeroCount=0;
    char choice;
    Scanner sc=new Scanner(System.in);
    do{
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    
        
        if(n>0){
            positiveNumberCount++;
        }
        else if(n<0){
            negativeNumberCount++;

        }
        else{
            zeroCount++;
        }

            System.out.println("Do you want to enter another number: Y or N? ");
            choice=sc.next().charAt(0);
        }
        while(choice=='Y' || choice=='y');
        System.out.println("The count of positive numbers is: "+positiveNumberCount);
        System.out.println("The count of negative numbers is: "+negativeNumberCount);
        System.out.println("The count of zero is: "+zeroCount);
}

    public static void main(String[] args) {
        countOfNumbers();
    }
}
