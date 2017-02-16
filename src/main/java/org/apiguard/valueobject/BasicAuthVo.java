package org.apiguard.valueobject;

import java.util.UUID;

public class BasicAuthVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String clientId;
	
	private String password;
	
	private String reqUri;

	public BasicAuthVo(UUID id, String creationDate, String lastUpdateDate, String clientId, String password, String reqUri) {
		super(id, creationDate, lastUpdateDate);
		this.clientId = clientId;
		this.password = password;
		this.reqUri = reqUri;
	}

	public String getClientId() {
		return clientId;
	}

	public String getPassword() {
		return password;
	}

	public String getReqUri() {
		return reqUri;
	}
}
