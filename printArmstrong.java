import java.util.Scanner;

public class printArmstrong{
  public static void main(String[] args){
    // Scanner n = new Scanner(System.in);
    // int s = n.nextInt();
    for(int i=100;i<1000;i++){
      if(checkArm(i)){
        System.out.print(i+ " ");
      }
  }
}
  static boolean checkArm(int s){
    int sum=0;
    for(int j=s;j>0;j=j/10){
      int x=j%10;
      sum=sum+ x*x*x;
    }
    return sum ==s;
  }
}
