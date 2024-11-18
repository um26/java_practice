import java.util.Scanner;

class Absolute_value{
    public static void main(String[] args){

    Scanner N = new Scanner(System.in);
    int n= N.nextInt();
    if (n>=0){
        System.out.println(n);
    }
    else{
        System.out.println(n*-1);
    }
}
}
