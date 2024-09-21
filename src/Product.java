import java.util.Scanner;

public class Product {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f=0, s=1;

        for (int i=0; i<n; i++){
            if(i>=2){
                int t=f+s;
                System.out.println(t);
                f=s;
                s=t;
            }else System.out.println(i);
        }
    }
}
