import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int []arr = {10,34,5,68,57,4,7,8};

       int num = 5;

       for (int i=0; i<arr.length; i++){
           if (num == arr[i]){
               System.out.println(i);
           }
       }
    }
}