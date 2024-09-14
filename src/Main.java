import java.util.Scanner;

public class Main {
    public static void printArr (int []arrr){
        for (int i=0; i<arrr.length; i++){
            System.out.print(arrr[i]+" ");
        }
    }
    public static void main (String[] args){
        int [] arr = {10,3,35};

        for (int i=0; i<arr.length-1; i++){
            int smallest = i;
            for (int j=i ; j<arr.length-1; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        printArr(arr);

    }
}