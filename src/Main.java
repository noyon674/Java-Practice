import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();

        int [][]arr = new int[row][col];

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //print arr
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.print("Search a number");
        int num = sc.nextInt();
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (arr[i][j] == num){
                    System.out.println("Positin of this number is: "+(i+1)+" "+(j+1));
                }
            }
        }
    }
}