package de.gravitex.processing.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries(
		{
		@NamedQuery(name = ProcessItem.FIND_ALL, query = "SELECT object(o) FROM ProcessItem AS o")
		})

@Entity(name="process_item")
public class ProcessItem {
	
	public static final String	FIND_ALL		= "ProcessItem.findAll";
	
	@Id
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
