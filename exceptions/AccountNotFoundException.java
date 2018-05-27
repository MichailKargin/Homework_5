package terminal.exceptions;

/**
 * Created by 12 on 27.05.2018.
 */
    public class AccountNotFoundException extends RuntimeException{
        public AccountNotFoundException (String message){
            super(message);
        }
    }

