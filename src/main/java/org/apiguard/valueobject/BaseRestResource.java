package org.apiguard.valueobject;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class BaseRestResource implements Serializable {
	private UUID id;
	
	private Date creationDate;
	
	public BaseRestResource(UUID id, Date creationDate) {
		this.id = id;
		this.creationDate = creationDate;
	}

	public UUID getId() {
		return id;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
}
