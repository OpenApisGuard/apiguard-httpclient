package org.apiguard.entity;

import java.util.Date;
import java.util.UUID;

public interface Base {

	public UUID getId();
	
	public Date getCreationDate();

	public Date getLastUpdateDate();
}
