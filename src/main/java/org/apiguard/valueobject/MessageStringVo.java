package org.apiguard.valueobject;

import java.util.Date;
import java.util.UUID;

public class MessageStringVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String message;

	public MessageStringVo(String message) {
		super(UUID.randomUUID(), new Date());
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
