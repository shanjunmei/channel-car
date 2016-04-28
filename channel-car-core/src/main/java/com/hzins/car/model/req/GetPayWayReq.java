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
 * 获取支付方式
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月8日 上午11:11:05
 * @version
 */
public class GetPayWayReq {

    private String enquiryNum;// ": "3030155244555", //询价单号

    private String insureNum;// ": "45645644564545", //投保单号

    private Integer branchId;// ": 45, //机构Id

    private Integer flatNo;// ": 2, //1表示pc，2表示mobile

    public String getEnquiryNum() {
	return enquiryNum;
    }

    public void setEnquiryNum(String enquiryNum) {
	this.enquiryNum = enquiryNum;
    }

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

    public Integer getBranchId() {
	return branchId;
    }

    public void setBranchId(Integer branchId) {
	this.branchId = branchId;
    }

    public Integer getFlatNo() {
	return flatNo;
    }

    public void setFlatNo(Integer flatNo) {
	this.flatNo = flatNo;
    }

}
