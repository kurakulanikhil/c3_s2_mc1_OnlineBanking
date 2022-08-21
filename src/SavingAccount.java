import java.util.Random;

public class SavingAccount {
    String accountHolderName;
    String accountStatus;
    Long accountBalance;

    public void savingAccount(String accountHolderName, String accountStatus, Long accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.accountBalance = accountBalance;
    }
    public String accountNumber() {
        Random obj = new Random();
        // long accountNumber = obj.nextLong(100000000000l);
        //System.out.println(number);
        String number = null;
        number = number + obj.nextInt(9);
        Math.random();
        return number;
    }
    public double withdrawlCash(int amount){

        return accountBalance - amount;

    }
    public double retriveBalance(){
        return accountBalance;

    }
    public double depositBalance(int amount){
        return accountBalance+ amount;

    }
    public double fundTransfer(int amount){
        return (accountBalance- amount);
    }
}
