/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car.model.rep;

/**
 * <p>
 * 
 * 线下支付
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月8日 上午11:26:35
 * @version
 */
public class DoOfflinePayRep {

    private String actionUrl;// ":"http://payment.hzins.com/" //慧择网关

    private String bsId;// ":"3f05e25d-c2a8-489b-a25b-1384c4b3a97c" //uuid

    private String consumeType;// ":"1" //消费类型（1：购买保险，2：充值）

    private String onliePaymentId;// ":"1" // 在线支付网关标识：1：支付宝；3：银联

    private String price;// ":"0.01" //价格

    private String notifyUrl;// ":"http://www.hzins.com/" ////支付完成返回的url

    private String partnerId;// ":"1" // 业务系统标识（1：主站；3：渠道；22：保运通）

    private String serviceNotifyUrl;// ":"" //

    private String productId;// ":"0" //产品Id

    private String productName;// ":"慧择车险产品" //产品名称

    private String payToInsurer;// ":"" //支付到保险公司的标识

    private String companyId;// ":"-1" //公司Id

    private String isNoDeal;// ":"" //

    private String sign;// ":"705da699a7d74d459aa12a0fe4d628bf" //签名

    private String bankId;// ":"0" //银行Id

    private String deadline;// ":"2015-12-31 23:55:00" //交易关闭时间

    private String payOrderNumber;// ":"11150050029889119" //支付单号

    public String getActionUrl() {
	return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
	this.actionUrl = actionUrl;
    }

    public String getBsId() {
	return bsId;
    }

    public void setBsId(String bsId) {
	this.bsId = bsId;
    }

    public String getConsumeType() {
	return consumeType;
    }

    public void setConsumeType(String consumeType) {
	this.consumeType = consumeType;
    }

    public String getOnliePaymentId() {
	return onliePaymentId;
    }

    public void setOnliePaymentId(String onliePaymentId) {
	this.onliePaymentId = onliePaymentId;
    }

    public String getPrice() {
	return price;
    }

    public void setPrice(String price) {
	this.price = price;
    }

    public String getNotifyUrl() {
	return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
	this.notifyUrl = notifyUrl;
    }

    public String getPartnerId() {
	return partnerId;
    }

    public void setPartnerId(String partnerId) {
	this.partnerId = partnerId;
    }

    public String getServiceNotifyUrl() {
	return serviceNotifyUrl;
    }

    public void setServiceNotifyUrl(String serviceNotifyUrl) {
	this.serviceNotifyUrl = serviceNotifyUrl;
    }

    public String getProductId() {
	return productId;
    }

    public void setProductId(String productId) {
	this.productId = productId;
    }

    public String getProductName() {
	return productName;
    }

    public void setProductName(String productName) {
	this.productName = productName;
    }

    public String getPayToInsurer() {
	return payToInsurer;
    }

    public void setPayToInsurer(String payToInsurer) {
	this.payToInsurer = payToInsurer;
    }

    public String getCompanyId() {
	return companyId;
    }

    public void setCompanyId(String companyId) {
	this.companyId = companyId;
    }

    public String getIsNoDeal() {
	return isNoDeal;
    }

    public void setIsNoDeal(String isNoDeal) {
	this.isNoDeal = isNoDeal;
    }

    public String getSign() {
	return sign;
    }

    public void setSign(String sign) {
	this.sign = sign;
    }

    public String getBankId() {
	return bankId;
    }

    public void setBankId(String bankId) {
	this.bankId = bankId;
    }

    public String getDeadline() {
	return deadline;
    }

    public void setDeadline(String deadline) {
	this.deadline = deadline;
    }

    public String getPayOrderNumber() {
	return payOrderNumber;
    }

    public void setPayOrderNumber(String payOrderNumber) {
	this.payOrderNumber = payOrderNumber;
    }

}
