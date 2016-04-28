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
 * @date 2016年1月21日 下午3:53:40
 * @version
 */
public class SearchCarListReq {

    // 搜索关键字
    private String keyword;

    // 品牌型号id
    private String brandId;

    // 车系名称
    private String carFamilyName;

    // 发动机型号
    private String engineName;

    // 档位
    private String gearboxName;

    // 页尺寸
    private String pageSize;

    // 当前页
    private String pageNo;

    // pc传0；h5传1
    private String platformFlag;

    
    public String getKeyword() {
        return keyword;
    }

    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    
    public String getBrandId() {
        return brandId;
    }

    
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    
    public String getCarFamilyName() {
        return carFamilyName;
    }

    
    public void setCarFamilyName(String carFamilyName) {
        this.carFamilyName = carFamilyName;
    }

    
    public String getEngineName() {
        return engineName;
    }

    
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    
    public String getGearboxName() {
        return gearboxName;
    }

    
    public void setGearboxName(String gearboxName) {
        this.gearboxName = gearboxName;
    }

    
    public String getPageSize() {
        return pageSize;
    }

    
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    
    public String getPageNo() {
        return pageNo;
    }

    
    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    
    public String getPlatformFlag() {
        return platformFlag;
    }

    
    public void setPlatformFlag(String platformFlag) {
        this.platformFlag = platformFlag;
    }
    
}
