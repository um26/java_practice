import java.util.*;

public class Main {
    public static void main(String[] args) {
      {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int x=scanner.nextInt();
        int count=1;
        int X=x;
        for(int i=0;i<n;i++){
            if(X-arr[i]>=0){
                X-=arr[i];
            }
            else{
                count++;
                X=x;
                i--;
                 
            }
        }
        System.out.println(count);
    }
    }
}
