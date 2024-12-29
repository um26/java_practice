import java.util.Scanner;

public class java-methodoverloading{
  public static void main(String[] args){
    sum(2,3,4);
    sum(4,7);
    num(9);
    num("Hey");
    }

  static int sum(int a, int b, int c){
    return a+b+c;
}

  static int sum(int a, int b){
    return a+b;
  }

  static int num(int a){
    return a;
}

static String num(String a){
  System.out.println(a);
}
