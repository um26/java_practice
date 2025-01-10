import java.util.Scanner;

public class isPrime-usingmethod{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    int i= n.nextInt();
    System.out.println(checkPrime(i));
  }

  static boolean checkPrime(int i){
      if(i<1) return false;
      
      for( int j=2;j < Math.sqrt(i);j++){
          if(i%j ==0) return false;
      }
      return true;
}

}
