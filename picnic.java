import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int u= scanner.nextInt();
        int[] arr=new int[u];
        for(int i=0;i<u;i++){
            arr[i]=scanner.nextInt();
        }
        int x=scanner.nextInt();
        System.out.println(picnic(u, arr, x));
    }
    
    public static int picnic(int u, int arr[], int x){
        int count=1;
        int X=x;
        for(int j=0;j<u; j++){
            if(X-arr[j]>=0){
                X-=arr[j];
            }
            else{
                count++;
                X=x;
                
                if(x-arr[j]<0) return -1;
                X -= arr[j];
            }
        }
        return count;
    }
}
