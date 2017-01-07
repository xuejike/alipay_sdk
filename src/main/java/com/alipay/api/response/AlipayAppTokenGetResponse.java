package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.app.token.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-29 19:56:12
 */
public class AlipayAppTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1481274749651993264L;

	/** 
	 * 应用访问令牌
	 */
	@ApiField("app_access_token")
	private String appAccessToken;

	/** 
	 * 应用访问凭证有效时间，单位：秒
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	public void setAppAccessToken(String appAccessToken) {
		this.appAccessToken = appAccessToken;
	}
	public String getAppAccessToken( ) {
		return this.appAccessToken;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public Long getExpiresIn( ) {
		return this.expiresIn;
	}

}