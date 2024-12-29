import java.util.Scanner

public class java_scope{
  public static void main(String[] args){
    // can't use x here


    int x =100;

    //you can use x here
    System.out.println(x);

    {
      //can't re-initialize x in this block
      //but can change the value of x;
  }

    //changed value will also be reflected here
}
