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

import java.util.List;

import com.hzins.car.model.info.CompanyBranchInfo;

/**
 * <p>
 * 
 *询价单同步返回结果
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 下午3:47:58
 * @version
 */
public class SaveBasicEnquiryRep {

    // 询价单号
    private String enquiryNum;

    // 报价公司
    private List<CompanyBranchInfo> companys;

    public String getEnquiryNum() {
	return enquiryNum;
    }

    public void setEnquiryNum(String enquiryNum) {
	this.enquiryNum = enquiryNum;
    }

    public List<CompanyBranchInfo> getCompanys() {
	return companys;
    }

    public void setCompanys(List<CompanyBranchInfo> companys) {
	this.companys = companys;
    }

}
