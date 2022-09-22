import java.util.Scanner;
public class ClassOne {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("enter the value of A: ");
            int a = input.nextInt();
            System.out.println("enter the value of B: ");
            int b = input.nextInt();
            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("b is greater than a");
            }
        } catch (Exception e) {
            System.out.println("u pressed wrong number");
        }
    }
}
