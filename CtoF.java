import java.util.Scanner;

class CtoF{
    
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        float C = scan.nextFloat();
        
        float F= (C*9/5)+32;
        System.out.println(F);
    }
}
