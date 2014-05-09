package es.unileon.aplicacionesweb.springapp.logic.handler;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
*
* @author roobre
*/
public final class TransactionHandlerProvider {

    private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    private static String lastTimestamp = "";
    private static long currentId = 0;
    
    /**
     *
     * @return
     */
    public static synchronized Handler getTransactionHandler() {
        String timestamp = format.format(new Date());
        if (timestamp.compareTo(TransactionHandlerProvider.lastTimestamp) != 0) {
            TransactionHandlerProvider.lastTimestamp = timestamp;
            TransactionHandlerProvider.currentId = 0;
        }

        return new TransactionHandler(++TransactionHandlerProvider.currentId, TransactionHandlerProvider.lastTimestamp);
    }

    private TransactionHandlerProvider() {
    }
}