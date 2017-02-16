package org.apiguard.valueobject;

import java.util.UUID;

public class ClientVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String clientId;

	public ClientVo(UUID id, String creationDate, String lastUpdateDate, String clientId) {
		super(id, creationDate, lastUpdateDate);
		this.clientId = clientId;
	}

	public String getClientId() {
		return clientId;
	}
}
