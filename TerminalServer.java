package terminal;

/**
 * Created by 12 on 27.05.2018.
 */
public interface TerminalServer {

    void startSession(String accountNumber);

    void checkPIN (String PIN);

    int getAccountBalance ();

    int getCash (int sum);

    int putCash (int sum);

    void finishSession();

}