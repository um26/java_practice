import java.util.Scanner;

public class multi_under_modulo{
    public static void main(String[] args){
        Scanner N = new Scanner(System.in);
        int a = N.nextInt();
        int b = N.nextInt();
        int n = N.nextInt();
        
        System.out.println((a*b)%n);
    }
}
