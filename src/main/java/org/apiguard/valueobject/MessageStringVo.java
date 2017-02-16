package org.apiguard.valueobject;

public class MessageStringVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String message;

	public MessageStringVo(String message) {
		super(null, null, null);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
