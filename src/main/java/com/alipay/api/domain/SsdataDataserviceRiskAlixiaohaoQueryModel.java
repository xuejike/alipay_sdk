package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询阿里通信小号信息
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class SsdataDataserviceRiskAlixiaohaoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2739199821879233926L;

	/**
	 * 电话号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
