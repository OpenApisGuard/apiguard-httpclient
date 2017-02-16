package org.apiguard.valueobject;

public class EexceptionVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String message;

	public EexceptionVo(String message) {
		super(null, null, null);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
