import java.util.Scanner;
public class mySwitch{
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("What day is it? ");
        String day = scan.nextLine().toLowerCase();
        switch(day) {
            case"monday":
                System.out.println("Welcome to a new week!!");
                break;
            case"tuesday":
                System.out.println("Today is Tuesday");
                break;
            case"Wednesday":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Input what day it is");
        };
    }
};