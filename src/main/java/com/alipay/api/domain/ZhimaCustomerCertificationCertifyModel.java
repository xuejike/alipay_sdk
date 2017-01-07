package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻认证开始认证
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class ZhimaCustomerCertificationCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 8287978737218835181L;

	/**
	 * 一次认证的唯一标识,在完成芝麻认证初始化后可以获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
