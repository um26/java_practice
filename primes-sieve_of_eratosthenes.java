import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int prime[]= new int[n+1];
      for(int i =2;i<n+1;i++){
        prime[i]=1;
      }
      
      for(int i=2;i*i<n+1;i++){
        if(prime[i]==1){
          for(int j=i+i;j<n+1;j+=i){
            prime[j]=0;
          }
        }
      }
      int count=0;
      for(int i=0;i<n+1;i++){
        if(prime[i]==1){
          count++;
          System.out.print(i+" ");
        }
      }
      System.out.println("  count:" + count);
    }
}
