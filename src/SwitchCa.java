import java.util.Scanner;
public class SwitchCa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the tea & coffee vending machine\n"+"Input 1:Tea\n"+"Input 2:Coffee");
        int a=input.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("preparing your coffee\n"+"here is your coffee\n"+"Have a nice drink");
                break;
            case 2:
                System.out.println("preparing your tea\n"+"here is your tea\n"+"Have a nice drink");
                break;
            default:
                System.out.println("your input is wrong");
        }
    }
}
