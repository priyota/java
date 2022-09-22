import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three numbers");
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if (a > b) {
                if (a > c) {
                    System.out.println("a is the greatest number");
                } else {
                    System.out.println("c is the greatest number");
                }
            } else if (b > a) {
                if (b > c) {
                    System.out.println("b is the greatest number");
                } else {
                    System.out.println("c is the greatest number");
                }
            } else {
                System.out.println("c is the greatest number");
            }
        }
        catch (Exception e) {
            System.out.println("you pressed wrong number");
        }
    }
}
