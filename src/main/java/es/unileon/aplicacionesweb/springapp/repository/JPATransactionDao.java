package es.unileon.aplicacionesweb.springapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.aplicacionesweb.springapp.domain.Transaction;

@Repository(value = "transactionDao")
public class JPATransactionDao implements TransactionDao{

	private EntityManager em = null;
	
	/*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Transaction> getTransactionsList() {
        return em.createQuery("select p from Transaction p order by p.id").getResultList();
    }

    @Transactional(readOnly = false)
    public void saveTransaction(Transaction transaction) {
        em.merge(transaction);
    }
    
}
