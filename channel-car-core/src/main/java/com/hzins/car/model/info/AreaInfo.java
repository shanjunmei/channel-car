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
 * 地区
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月8日 上午10:57:32
 * @version
 */
public class AreaInfo {

    private Integer id; // 区域id

    private String areaNumber;// "130100", //区域码

    private String areaName;// ":"石家庄市", // 区域名称

    private String plateNum;// ":"冀A", // 车牌

    private Integer status;// ":1, // 状态，1可投保，0不可投保

    private String pinyin;// ":"shijiazhuangshi", // 城市拼音全拼

    private String shortName;// ":"sjzs" // 城市拼音缩写

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getAreaNumber() {
	return areaNumber;
    }

    public void setAreaNumber(String areaNumber) {
	this.areaNumber = areaNumber;
    }

    public String getAreaName() {
	return areaName;
    }

    public void setAreaName(String areaName) {
	this.areaName = areaName;
    }

    public String getPlateNum() {
	return plateNum;
    }

    public void setPlateNum(String plateNum) {
	this.plateNum = plateNum;
    }

    public Integer getStatus() {
	return status;
    }

    public void setStatus(Integer status) {
	this.status = status;
    }

    public String getPinyin() {
	return pinyin;
    }

    public void setPinyin(String pinyin) {
	this.pinyin = pinyin;
    }

    public String getShortName() {
	return shortName;
    }

    public void setShortName(String shortName) {
	this.shortName = shortName;
    }

}
