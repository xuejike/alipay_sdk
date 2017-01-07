package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.instance.add response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-16 16:34:56
 */
public class AlipayPassInstanceAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8563454114287557574L;

	/** 
	 * 接口调用返回结果信息,如果添加成功则展示券ID
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【true：成功；false：失败】
	 */
	@ApiField("success")
	private String success;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
