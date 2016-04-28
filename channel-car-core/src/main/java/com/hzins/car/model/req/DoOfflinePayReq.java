/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car.model.req;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月8日 上午11:23:09
 * @version
 */
public class DoOfflinePayReq {

    private String insureNum;// ": "45645644564545", //投保单号

    private String onliePaymentId;// ":"1", // 在线支付网关标识：1：支付宝；3：银联

    private String partnerId;// ": "1", // 业务系统标识（1：主站；3：渠道；22：保运通）

    private String consumeType;// ": "1", //消费类型（1：购买保险，2：充值）

    private String notifyUrl;// ": "http://www.hzins.com/" //支付完成返回的url

    private String deadline;// ": "2015-12-30 23:59:59" //交易关闭时间

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

    public String getOnliePaymentId() {
	return onliePaymentId;
    }

    public void setOnliePaymentId(String onliePaymentId) {
	this.onliePaymentId = onliePaymentId;
    }

    public String getPartnerId() {
	return partnerId;
    }

    public void setPartnerId(String partnerId) {
	this.partnerId = partnerId;
    }

    public String getConsumeType() {
	return consumeType;
    }

    public void setConsumeType(String consumeType) {
	this.consumeType = consumeType;
    }

    public String getNotifyUrl() {
	return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
	this.notifyUrl = notifyUrl;
    }

    public String getDeadline() {
	return deadline;
    }

    public void setDeadline(String deadline) {
	this.deadline = deadline;
    }

}
