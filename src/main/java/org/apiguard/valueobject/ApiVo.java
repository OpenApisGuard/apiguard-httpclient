package org.apiguard.valueobject;

import java.util.Date;
import java.util.UUID;

public class ApiVo extends BaseRestResource {
	private static final long serialVersionUID = 1L;

	private String reqUri;

	private String name;

	private String fwdUri;
	
	private boolean isAuthRequired;

	private boolean isBasicAuth;

	private boolean isKeyAuth;
	
	private boolean isHmacAuth;
	
	private boolean isOAuth2Auth;
	
	private boolean isJwtAuth;
	
	private boolean isLdapAuth;
	
	public ApiVo(UUID id, Date creationDate, String name, String reqUri, String fwdUri, boolean isAuthRequired, boolean isBasicAuth, boolean isKeyAuth, boolean isHmacAuth, boolean isOAuth2Auth, boolean isJwtAuth, boolean isLdapAuth) {
		super(id, creationDate);
		this.reqUri = reqUri;
		this.name = name;
		this.fwdUri = fwdUri;
		this.isAuthRequired = isAuthRequired;
		this.isBasicAuth = isBasicAuth;
		this.isHmacAuth = isHmacAuth;
		this.isJwtAuth = isJwtAuth;
		this.isKeyAuth = isKeyAuth;
		this.isLdapAuth = isLdapAuth;
		this.isOAuth2Auth = isOAuth2Auth;
	}

	public String getReqUri() {
		return reqUri;
	}

	public String getName() {
		return name;
	}

	public String getFwdUri() {
		return fwdUri;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isAuthRequired() {
		return isAuthRequired;
	}

	public boolean isBasicAuth() {
		return isBasicAuth;
	}

	public boolean isKeyAuth() {
		return isKeyAuth;
	}

	public boolean isHmacAuth() {
		return isHmacAuth;
	}

	public boolean isOAuth2Auth() {
		return isOAuth2Auth;
	}

	public boolean isJwtAuth() {
		return isJwtAuth;
	}

	public boolean isLdapAuth() {
		return isLdapAuth;
	}
}
