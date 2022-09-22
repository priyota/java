import java.util.Scanner;
import java.lang.Math;
public class DecimalNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two floating point numbers:");
        float x=input.nextFloat();
        float y=input.nextFloat();
        x=Math.round(x*100);
        x=x/100;

        y=Math.round(y*100);
        y=y/100;
        if(x==y)
        {
            System.out.println("they are same upto two decimal places");
        }
        else{
            System.out.println("they are not same upto two decimal places");
        }
    }
}
