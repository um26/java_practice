import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();
        char ch=in.next().trim().charAt(0);
        int result;
        if(ch=='+'){
            System.out.print(num1+num2);
        }
        else if(ch=='-'){
            System.out.print(num1-num2);
        }
        else if(ch=='*'){
            System.out.print(num1*num2);
        }
        else if (ch=='/'){
            System.out.print(num1/num2);
        }
        else if(ch=='%'){
            System.out.print(num1%num2);
        }
        else{
            System.out.print("Invalid Operator");
        }
    }
}