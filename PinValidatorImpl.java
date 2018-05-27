package terminal;

/**
 * Created by 12 on 23.05.2018.
 */
public class PinValidatorImpl implements PinValidator {

    public void validate (Account account, String pin){
        if (!pin.equals(account.getPin()))
        {
            throw new RuntimeException("Некорректный пин");
        }
    }

}
