package com.hzins.car.model.notify;

import java.util.List;

/**
 * 
 * <p>
 * 
 *询价通知
 *
 * </p>
 *  
 * @author	hz15101769 
 * @date	2016年4月14日 下午5:07:37
 * @version
 */
public class EnquiryResult {

    private String enquiryNum; //询价单号

    private Integer branchId; //分支id
    
    private String branchName;

    private Float strongServiceFeeRate; //交强险服务费比例

    private Float strongServiceFee; //交强险服务费

    private Float bussinessServiceFeeRate; //商业险服务费比例

    private Float bussinessServiceFee; //商业险服务费

    private float totalPremium; //总保费

    private byte status;// 报价状态 待填写-1，待报价0，已报价1，报价失败2，拒保3，自动报价失败，走crm线下报价4

    private float lateFee;// 滞纳金

    private float taxationPremium;// 车船税

    private float busiPremium; // 商业险保费

    private float trafficPremium; // 交强险保费

    private String error;// 报价失败原因

    private float isNoDeductibleTotal; // 总的不计免赔价格

    private List<CarProtectResult> carProtectParams;

    
    
    public String getBranchName() {
        return branchName;
    }

    
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getEnquiryNum() {
	return enquiryNum;
    }

    public void setEnquiryNum(String enquiryNum) {
	this.enquiryNum = enquiryNum;
    }

    public Integer getBranchId() {
	return branchId;
    }

    public void setBranchId(Integer branchId) {
	this.branchId = branchId;
    }

    public Float getStrongServiceFeeRate() {
	return strongServiceFeeRate;
    }

    public void setStrongServiceFeeRate(Float strongServiceFeeRate) {
	this.strongServiceFeeRate = strongServiceFeeRate;
    }

    public Float getStrongServiceFee() {
	return strongServiceFee;
    }

    public void setStrongServiceFee(Float strongServiceFee) {
	this.strongServiceFee = strongServiceFee;
    }

    public Float getBussinessServiceFeeRate() {
	return bussinessServiceFeeRate;
    }

    public void setBussinessServiceFeeRate(Float bussinessServiceFeeRate) {
	this.bussinessServiceFeeRate = bussinessServiceFeeRate;
    }

    public Float getBussinessServiceFee() {
	return bussinessServiceFee;
    }

    public void setBussinessServiceFee(Float bussinessServiceFee) {
	this.bussinessServiceFee = bussinessServiceFee;
    }

    public float getTotalPremium() {
	return totalPremium;
    }

    public void setTotalPremium(float totalPremium) {
	this.totalPremium = totalPremium;
    }

    public byte getStatus() {
	return status;
    }

    public void setStatus(byte status) {
	this.status = status;
    }

    public float getLateFee() {
	return lateFee;
    }

    public void setLateFee(float lateFee) {
	this.lateFee = lateFee;
    }

    public float getTaxationPremium() {
	return taxationPremium;
    }

    public void setTaxationPremium(float taxationPremium) {
	this.taxationPremium = taxationPremium;
    }

    public float getBusiPremium() {
	return busiPremium;
    }

    public void setBusiPremium(float busiPremium) {
	this.busiPremium = busiPremium;
    }

    public float getTrafficPremium() {
	return trafficPremium;
    }

    public void setTrafficPremium(float trafficPremium) {
	this.trafficPremium = trafficPremium;
    }

    public String getError() {
	return error;
    }

    public void setError(String error) {
	this.error = error;
    }

    public float getIsNoDeductibleTotal() {
	return isNoDeductibleTotal;
    }

    public void setIsNoDeductibleTotal(float isNoDeductibleTotal) {
	this.isNoDeductibleTotal = isNoDeductibleTotal;
    }

    public List<CarProtectResult> getCarProtectParams() {
	return carProtectParams;
    }

    public void setCarProtectParams(List<CarProtectResult> carProtectParams) {
	this.carProtectParams = carProtectParams;
    }

}
