package es.unileon.aplicacionesweb.springapp.logic.handler;

/**
 * Represents the id of a transaction.
 */
public class TransactionHandler implements Handler {

	// Original code
	// private final long id;
	// private final String timestamp;

	/**
	 * The identification of a Handler.
	 */
	private long id;

	/**
	 * The timestamp for a transaction.
	 */
	private String timestamp;

	/**
	 * Empty constructor.
	 */
	public TransactionHandler() {

	}

	/**
	 * 
	 * @param id
	 * @param timestamp
	 */
	public TransactionHandler(long id, String timestamp) {
		this.id = id;
		this.timestamp = timestamp;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return timestamp + "." + Long.toString(id);
	}

	/**
	 * Compare the actual handler with another
	 * 
	 * @param another
	 *            ( Handler to compare )
	 * @return (0 if are equals, != 0 otherwise )
	 */
	public int compareTo(Handler another) {
		return this.toString().compareTo(another.toString());
	}
	
	/**
	 * 
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}