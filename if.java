import java.util.Scanner;

public class if{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        if (salary>=1000){
            salary+=2000;
        }
        else{
            salary+=1000;
        }
        System.out.println(salary);
    }
    
}