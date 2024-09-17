import java.util.Scanner;

public class Main {
    public static void printArray(int ar[]){
        for (int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main (String[] args){
        //unsorted array
        int []arr = {3,5,38,54,6};
        //suppose 1st element is sorted, after all the unsorted arr
        //unsorted array
       for (int i=1; i<arr.length; i++){
           int currentElement = arr[i];
           int j = i-1;
           while (j >= 0 && currentElement <arr[j]){
               arr[j+1] = arr[j];
               j--;
           }
           //placement
           arr[j+1] = currentElement;
       }
        printArray(arr);
    }
}