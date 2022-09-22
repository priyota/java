import java.util.Scanner;
public class UppercaseLowercase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().charAt(0);
        if(ch>64&&ch<91) {
            System.out.println(ch + " is an uppercase letter");
        }
            else if(ch>96&&ch<123){
            System.out.println(ch+" is a lower case letter");
        }
            else{
            System.out.println(ch+" this is not either an uppercase or lowercase letter");
        }
    }
}
