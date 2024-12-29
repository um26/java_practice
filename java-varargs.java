import java.util.Scanner;

public class java-varargs{
  public static void main(String[] args){

    fun(1,4 ,2,2,5,4);
    classandnames(1,3 "Sam", "Ram", "prem");
    }
  public void fun(int ...v){
    System.out.println(Arrays.toString(v));
}
  public void classandnames(int a, int b, String ...s){
    }
