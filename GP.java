import java.util.Scanner;
import java.lang.Math;

class GP{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int r = input.nextInt();
        int N = input.nextInt();
        
        double result =a*Math.pow(r,(N-1));
        System.out.println(result);
    }
}
