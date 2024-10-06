import java.util.Scanner;

public class while_loop{
    public static void main(String[] args){
        Scanner in =  new Scanner (System.in);
        int n = in.nextInt();

        int num=1;
        while(num<=n){
            System.out.print(num + " ");
            num++;
        }
    }
}