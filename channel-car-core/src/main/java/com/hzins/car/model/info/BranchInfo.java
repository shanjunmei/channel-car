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
 * 分支机构信息
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月13日 下午5:34:31
 * @version
 */
public class BranchInfo {

    private Integer companyId;// ": 1, //公司id

    private Integer branchId;// ": 2, //分支机构id

    private String companyName;// ": "", //公司名称

    private String branchName;// ": "", //分支机构名称

    private String shortName;// ": “”, //简称

    private String smallLogoImg;// ": "http:", //公司logo小图

    private String mobileLogoImg;// ": “http:”//移动图片

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

    public String getShortName() {
	return shortName;
    }

    public void setShortName(String shortName) {
	this.shortName = shortName;
    }

    public String getSmallLogoImg() {
	return smallLogoImg;
    }

    public void setSmallLogoImg(String smallLogoImg) {
	this.smallLogoImg = smallLogoImg;
    }

    public String getMobileLogoImg() {
	return mobileLogoImg;
    }

    public void setMobileLogoImg(String mobileLogoImg) {
	this.mobileLogoImg = mobileLogoImg;
    }

}
