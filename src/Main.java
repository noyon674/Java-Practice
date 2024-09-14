import java.util.Scanner;

public class Main {
    public static void printArr (int []arrr){
        for (int i=0; i<arrr.length; i++){
            System.out.print(arrr[i]+" ");
        }
    }
    public static void main (String[] args){
        int [] arr = {10,3,6,3,29,4, 56, 3,46, 35};

        for (int i=0; i<arr.length - 1; i++){
            for (int j=0; j<arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);

    }
}