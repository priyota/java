import java.util.Scanner;
public class AtmProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the ATM \n"+"select 1 for withdraw\n"+"Select 2 for deposit\n"+"Select 3 for check balance\n"
        +"Select 4 exit\n"+"select the appropriate opertion to perform: ");
        System.out.println("enter the current balance: ");
        int balance= input.nextInt();
        System.out.println("enter operation number: ");
        int a=input.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("enter the number to be withdrawn");
                int withdrawamount=input.nextInt();
                withdraw(balance,withdrawamount);
                break;
            case 2:
                System.out.println("enter the amount to be deposited");
                int depositamount= input.nextInt();
                deposit(balance,depositamount);
                break;
            case 3:
                System.out.println(" Now the current amount is");
                System.out.println(balance);
                break;
            case 4 :
                System.exit(0);
                break;
        }

    }
    public static int withdraw(int balance,int withdrawamount)
    {
        if(balance<withdrawamount)
        {
            System.out.println("U have not enough money to be withdrawn");
        }
        else
        {
         balance=balance-withdrawamount;
            System.out.println("now the current balance is"+balance);

        }
        return balance;
    }
    public static int deposit(int balance, int depositamount){
        balance=balance+depositamount;
        System.out.println("your current balance is "+balance);
        return balance;
    }
}
