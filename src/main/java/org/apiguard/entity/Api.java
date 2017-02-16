package org.apiguard.entity;

public interface Api extends Base {

	public String getReqUri();

	public String getName();

	public String getDownstreamUri();
	
	public boolean isAuthRequired();
	
	public boolean isBasicAuth();
	
	public boolean isKeyAuth();
	
	public boolean isHmacAuth();
	
	public boolean isOAuth2Auth();
	
	public boolean isJwtAuth();
	
	public boolean isLdapAuth();
}
