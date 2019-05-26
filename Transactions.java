import java.util.Timer;
import java.util.TimerTask;

public class Transactions {

    public static void withdraw(Bank account, int value, TransactionListener event) {
        // loading begins
        event.onLoading();

        if(account == null) {
            // sends the error message and stops
            event.onError("Account is null or empty");
            return;
        }

        int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                account.setTotal(account.getTotal() - value);
                event.onComplete(account);
            }
        }, time);
    }
}
