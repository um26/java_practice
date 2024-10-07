import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp=0, a=0;
        for(int i=n; i>0; i/=10){
            temp=i%10;
            a=a*10+temp;
        }
        System.out.print(a);
    }
}