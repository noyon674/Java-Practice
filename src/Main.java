import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();

        System.out.print("Enter Col: ");
        int col = sc.nextInt();

        int [][] arr = new int[row][col];

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}