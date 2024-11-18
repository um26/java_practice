import java.util.Scanner;

class isPrime{
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count=0;
        for(int i=N-1;i>=2;i--){
            if(N%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Not a Prime");
        }
        else{
            System.out.println("Is a Prime");
        }
    }
}
