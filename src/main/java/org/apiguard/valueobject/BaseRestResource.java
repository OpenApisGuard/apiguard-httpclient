package org.apiguard.valueobject;

import java.io.Serializable;
import java.util.UUID;

public class BaseRestResource implements Serializable {
	private static final long serialVersionUID = 1L;

	private UUID id;
	
	private String creationDate;

	private String lastUpdateDate;
	
	public BaseRestResource(UUID id, String creationDate, String lastUpdateDate) {
		this.id = id;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
	}

	public UUID getId() {
		return id;
	}
	
	public String getCreationDate() {
		return creationDate;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
}
