package terminal;
import terminal.exceptions.*;
/**
 * Created by 12 on 23.05.2018.
 */
public class Account {
    private final String accountNumber;
    private final String pin;
    private int balance;

    public Account (String accountNumber, String pin) {

        this.accountNumber = accountNumber;
        this.pin = pin;

    }

    public String getAccountNumber(){

        return accountNumber;

    }

    public String getPin(){

        return pin;

    }

    public int getBalance(){
        return balance;
    }

    public int putCash(int cash){
        balance += cash;
        return balance;
    }

    public int getCash (int cash){
        if (cash > balance) {
            throw new InsufficientFundsException ("Недостаточно средств для снятия такой суммы");
        }

        balance -= cash;
        return balance;
    }


}
