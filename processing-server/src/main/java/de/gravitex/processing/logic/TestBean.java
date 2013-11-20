package de.gravitex.processing.logic;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.gravitex.processing.entity.ProcessItemEntity;

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

	public List<ProcessItemEntity> findAllProcessItems() {
		return null;
//		return em.createNamedQuery(ProcessItem.FIND_ALL).getResultList();
	}
	
	public void createProcessItem(ProcessItemEntity processItem) throws MyException {
		em.persist(processItem);
	}
}
