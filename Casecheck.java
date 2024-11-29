import java.util.Scanner;

public class Casecheck{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char ch= in.next().trim().charAt(0);

        if (ch > 'a' && ch <'z'){
            System.out.print("LowerCase");
        }
        else if(ch>'A' && ch <'Z'){
            System.out.print("UpperCase");
        }
    }
}