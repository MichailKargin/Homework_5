package terminal;

/**
 * Created by 12 on 23.05.2018.
 */
public interface Terminal {
    boolean isSessionStarted (String accountNumber);

    boolean isPinEntered (String pin);

    void getAccountBalance();

    void getCash (int sum);

    void putCash (int sum);

    void stopSession ();
}
