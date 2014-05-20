package es.unileon.aplicacionesweb.springapp.logic.handler;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* The handler provider.
*/
public final class TransactionHandlerProvider {

	/**
	 * Formatter for dates.
	 */
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    
    /**
     * Last time stamp.
     */
    private static String lastTimestamp = "";
    
    /**
     * Contains the current id.
     */
    private static long currentId = 0;
    
    /**
     *
     * @return a new transaction Handler.
     */
    public static synchronized Handler getTransactionHandler() {
        String timestamp = format.format(new Date());
        if (timestamp.compareTo(TransactionHandlerProvider.lastTimestamp) != 0) {
            TransactionHandlerProvider.lastTimestamp = timestamp;
            TransactionHandlerProvider.currentId = 0;
        }

        return new TransactionHandler(++TransactionHandlerProvider.currentId, TransactionHandlerProvider.lastTimestamp);
    }

    /**
     * Empty constructor.
     */
    private TransactionHandlerProvider() {
    }
}