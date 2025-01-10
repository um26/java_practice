import java.util.Scanner;

public class isArmstrong{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    int s = n.nextInt();
    System.out.println(checkArm(s));
  }

  static boolean checkArm(int s){
    int sum=0;
    for(int j=s;j>0;j=j/10){
      int x=j%10;
      sum=sum+ x*x*x;
    }
    if(sum==s) return true;
    else return false;
  }
}
