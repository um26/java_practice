import java.util.Scanner;

public class dayoftheweek_switch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        
        switch(a){
            case 1 -> System.out.print("MONDAY");
            case 2 -> System.out.print("TUESDAY");
            case 3 -> System.out.print("WEDNESDAY");
            case 4 -> System.out.print("THURSDAY");
            case 5 -> System.out.print("FRIDAY");
            case 6 -> System.out.print("SATURDAY");
            case 7 -> System.out.print("SUNDAY");
        }
    }
}