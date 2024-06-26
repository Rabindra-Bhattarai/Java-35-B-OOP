package Week8;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount a=new BankAccount(123,"Ravi",120);
        
        System.out.println(a.getAccount_Balance());
        a.deposit(5);
        System.out.println(a.getAccount_Balance());
        a.withdraw(3);
        System.out.println(a.getAccount_Balance());
        a.withdraw(4000);
        System.out.println(a.getAccountHolderName());


    }
}
/*you are building a banking application that has a BankAccount class.
 * Implement the BankAccount class with encapsulation principles in mind.
 * include private instance variables for the 
 * accoint number, account holder name and account balance,
 * privide punlic methods to allow clients to deposit and withdraw funds,
 * as well as access the account balance 
 * ensure that user cannot withdraw balancce if it can go to negetive
 * ensure that the account balance cannot be accessed or modified directly.
 * Note make constructor to full the attribute on account opening 
 * make getter for account number and account holder name
 */
class BankAccount{
    private int account_number,account_balance;
    private String account_holder_name;
    BankAccount(int account_number, String account_holder_name,int account_balance){
        this.account_number=account_number;
        this.account_holder_name=account_holder_name;
        this.account_balance=account_balance;
    }
    public void deposit(int amount){
        this.account_balance+=amount;
    }
    public void withdraw(int amount){
        if((this.account_balance<amount)){
        this.account_balance-=amount;
        System.out.println("withdrawal success");}
        else{
            System.out.println("Insuffucuent balance");
        }
    }
    public int getAccount_Balance(){
        return account_balance;
    }
    public String getAccountHolderName(){
        return account_holder_name;
    }
    public int getAccountNumber(){
        return account_number;
    }
}