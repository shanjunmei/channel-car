/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car.model.info;

/**
 * <p>
 * 
 * 公司机构信息
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月8日 上午11:42:36
 * @version
 */
public class CompanyBranchInfo {

    private Integer companyId;// :46

    private Integer branchId;// :46

    private String companyName;// :“中国平安”

    private String branchName;// :”分支机构名称”

    public Integer getCompanyId() {
	return companyId;
    }

    public void setCompanyId(Integer companyId) {
	this.companyId = companyId;
    }

    public Integer getBranchId() {
	return branchId;
    }

    public void setBranchId(Integer branchId) {
	this.branchId = branchId;
    }

    public String getCompanyName() {
	return companyName;
    }

    public void setCompanyName(String companyName) {
	this.companyName = companyName;
    }

    public String getBranchName() {
	return branchName;
    }

    public void setBranchName(String branchName) {
	this.branchName = branchName;
    }

}
