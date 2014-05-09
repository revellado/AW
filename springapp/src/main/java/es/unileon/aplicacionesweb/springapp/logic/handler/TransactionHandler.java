package es.unileon.aplicacionesweb.springapp.logic.handler;

/**
*
* @author roobre
*/
public class TransactionHandler implements Handler {

//	  Original code
//    private final long id;
//    private final String timestamp;

	  private long id;
	  private String timestamp;
	  
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

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

    public int compareTo(Handler another) {
        return this.toString().compareTo(another.toString());
    }

}