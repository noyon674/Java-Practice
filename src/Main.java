import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = sc.nextInt();
        System.out.print("Enter col number: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];


        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Seach a number: ");
        int num = sc.nextInt();

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (arr[i][j]==num){
                    System.out.println(i+" "+j);
                }
            }
            System.out.println();
        }
    }
}