import java.util.Scanner;

public class printtheindices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=4;
        System.out.println("Enter the no of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int columns=sc.nextInt();
        int matrix[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]==number){
                    System.out.format("Number is found at index: %d,%d",i,j);
                }
            }
        }
    }
}
