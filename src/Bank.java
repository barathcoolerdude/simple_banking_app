
public class Bank{
    String name;
    int balance;
    String account_type;    

    public void addAccount(String name, int balance, String account_type){
        this.name = name;
        this.balance = balance;
        this.account_type = account_type;
        System.out.println("user name: "+ this.name+" initial balance: "+ this.balance+" account type: "+ this.account_type);
    }


}