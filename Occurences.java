import java.util.Scanner;

public class Occurences{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, count=0, i, rem;
        a= in.nextInt();
        
        for(i=n; i>0; i/=10){
            rem=i%10;
            
            if(rem==a){
                count++;
            }
        }
        System.out.print(count);
    }
}