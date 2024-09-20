import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        boolean isLoggedIn = true;
        int age = 24;
        String name = "Noyon";
        float cgpa = 3.50f;
        double Salary = 25000.50d;
        char word = 'A';

        //normal way for print value
        System.out.println("The booolean value is "+isLoggedIn);

        //format specifier for print  value
        System.out.printf("The boolean value is %b", isLoggedIn);
        System.out.printf("The intger value is %d\n", age);
        System.out.printf("The string value is %s\n", name);
        System.out.printf("The float value is %.2f\n", cgpa); //.2 for after floating point
        System.out.printf("The double value is %.2f\n", Salary);
        System.out.printf("The word value is %c\n", word);
    }
}