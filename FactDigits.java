import java.util.Scanner;

class FactDigits{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result=1;
        for(int i =N; i>0; i--){
            result*=i;
        }
        int digits=0;
        for(int i=result; i>0; i/=10){
            result/=10;
            digits++;
        }
        System.out.println(digits);
    }
}
