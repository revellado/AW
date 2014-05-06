package es.unileon.aplicacionesweb.springapp.logic.handler;


public class TransactionHandler implements Handler {

    private long id;
	private String timestamp;

    
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
}