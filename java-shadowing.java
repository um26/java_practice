import java.util.Scanner;

public class java-shadowing{
  static int x=40;
  public static void main(String[] args){
    
    System.out.println(x);//40

    int x=60;
    System.out.println(x);//60
    }
}
