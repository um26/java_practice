import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int count=0;int flag=0;
      for(int i=0;i<n;i++){
        if(arr[i]==flag){
          count++; flag^=1;}
        }
      System.out.println(count);
    }
}
