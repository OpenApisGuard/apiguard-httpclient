package org.apiguard.valueobject;

import java.util.Date;
import java.util.UUID;

public class KeyAuthVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String clientId;
	
	private String key;
	
	private String reqUri;

	public KeyAuthVo(UUID id, String creationDate, String lastUpdateDate, String clientId, String key, String reqUri) {
		super(id, creationDate, lastUpdateDate);
		this.clientId = clientId;
		this.key = key;
		this.reqUri = reqUri;
	}

	public String getClientId() {
		return clientId;
	}

	public String getKey() {
		return key;
	}

	public String getReqUri() {
		return reqUri;
	}
}
