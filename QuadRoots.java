import java.util.Scanner;
import java.lang.Math;

class QuadRoots{
    
    public static void main(String[] args){
        
        Scanner scan= new Scanner(System.in);
        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C= scan.nextFloat();
        
        System.out.println((-B + Math.sqrt(B*B-4*A*C))/(2*A));
        System.out.println((-B - Math.sqrt(B*B-4*A*C))/(2*A));
    }
}
