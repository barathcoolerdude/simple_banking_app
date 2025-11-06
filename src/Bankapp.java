import java.util.*;
public class Bankapp{
    public static void main (String []args){
       Scanner s=new Scanner(System.in);
       Bank bank = new Bank(); 
       System.out.println("enter user name: ");
       String name = s.nextLine();
       System.out.println("enter balance: ");
       int balance = s.nextInt();
       s.nextLine();
       System.out.println("enter type of account: ");
       String account_type = s.nextLine();

       bank.addAccount(name, balance, account_type);

       s.close();

    }
}