package es.unileon.aplicacionesweb.springapp.logic.history;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.logic.handler.Handler;


/**
 *
 * @author roobre
 * @param <T>
 */
public class History<T extends Transaction> {

//	Original code
//  private final Collection<T> transactions;
	private Collection<T> transactions;

    public Collection<T> getTransactions() {
		return transactions;
	}

	public void setTransactions(Collection<T> transactions) {
		this.transactions = transactions;
	}

	/**
     *
     */
    public History() {
        this.transactions = new ArrayList();
    }

    /**
     *
     * @param transaction
     * @return
     */
    public boolean add(T transaction) {
        boolean found = false;
        Iterator<T> it = this.transactions.iterator();
        while (it.hasNext() && !found) {
            T t = it.next();
            if (t.getId().compareTo(transaction.getId()) == 0) {
                found = true;
            }
        }
        if (!found) {
            return this.transactions.add(transaction);
        }
        return false;

    }

    /**
     *
     * @param args
     * @return
     */
    public Iterator<T> getIterator() {
        return this.transactions.iterator();
    }

    /**
     *
     * @param id
     * @return
     */
    public boolean remove(Handler id) {
        boolean found = false;
        Iterator<T> it = this.transactions.iterator();
        while (it.hasNext() && !found) {
            T t = it.next();
            if (t.getId().compareTo(id) == 0) {
                found = true;
                this.transactions.remove(t);
            }
        }
        return found;
    }
}
