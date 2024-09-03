import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String email = "sarker1w4tu2@gamil.com";
        String userName = "";
        int length = 0;

        for (int i=0; i<email.length(); i++){
            if (email.charAt(i) == '@'){
                break;
            }else length +=1;
        }

        System.out.println(email.substring(0, length));
    }
}