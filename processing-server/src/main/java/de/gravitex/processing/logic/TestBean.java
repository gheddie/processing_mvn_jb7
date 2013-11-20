package de.gravitex.processing.logic;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.gravitex.processing.entity.ProcessItem;

@Stateless
@Remote(TestRemote.class)
public class TestBean implements TestRemote {
	
	@PersistenceContext(name="pgPersistenceUnit")
	EntityManager em;

	public void sayMoo() {
		System.out.println("moo123...");
	}

	public void sayMee() {
		System.out.println("mee123...");		
	}

	@SuppressWarnings("unchecked")
	public List<ProcessItem> findAllProcessItems() {
		return null;
//		return em.createNamedQuery(ProcessItem.FIND_ALL).getResultList();
	}
	
	public void createProcessItem(ProcessItem processItem) throws MyException {
		em.persist(processItem);
	}
}
