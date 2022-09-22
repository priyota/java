import java.util.Scanner;
public class PositiveNegative
{
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in) ;
        System.out.println("enter a number: ");
        int a=input.nextInt();
        try {
            if (a >= 0) {
                System.out.println("this is a positive number");
            } else
                System.out.println("this is negative number");
        } catch (Exception e) {
            System.out.println("u pressed wrong number10");
        }

    }
}
