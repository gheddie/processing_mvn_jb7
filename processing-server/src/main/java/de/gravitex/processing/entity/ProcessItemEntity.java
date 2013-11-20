package de.gravitex.processing.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//@NamedQueries({ @NamedQuery(name = ProcessItem.FIND_ALL_ENTRIES, query = "SELECT o FROM ProcessItem AS o") })

@Entity(name = "process_item")
@SequenceGenerator(name="processing_id_seq")
public class ProcessItemEntity implements Serializable {

//	public static final String FIND_ALL_ENTRIES = "ProcessItem.findAllEntries";

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="processing_id_seq")
	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
