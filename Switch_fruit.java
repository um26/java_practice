import java.util.Scanner;

public class Switch_fruit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        
        switch (fruit){
            case "Mango":
                System.out.print("King of fruits");
                break;
            case "Apple":
                System.out.print("Sweet red fruit");
                break;
            case "Orange":
                System.out.print("Orange round fruit");
                break;
            case "Grape":
                System.out.print("Small round fruit");
                break;
            default:
                System.out.print("Invalid Fruit Name");
                
        }
    }
}