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

import com.hzins.car.model.info.BrandInfo;
import com.hzins.car.model.info.CarInfo;

/**
 * <p>
 * 
 *车型查询请求
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月21日 下午6:08:32
 * @version
 */
@SuppressWarnings("rawtypes")
public class SearchCarListRep {

    private List<CarInfo> cars;

    private List<BrandInfo> brands;

    private List carFamilys;

    private List engines;

    private List gearboxs;

    private Integer count;

    public List<CarInfo> getCars() {
	return cars;
    }

    public void setCars(List<CarInfo> cars) {
	this.cars = cars;
    }

    public List<BrandInfo> getBrands() {
	return brands;
    }

    public void setBrands(List<BrandInfo> brands) {
	this.brands = brands;
    }

    public List getCarFamilys() {
	return carFamilys;
    }

    public void setCarFamilys(List carFamilys) {
	this.carFamilys = carFamilys;
    }

    public List getEngines() {
	return engines;
    }

    public void setEngines(List engines) {
	this.engines = engines;
    }

    public List getGearboxs() {
	return gearboxs;
    }

    public void setGearboxs(List gearboxs) {
	this.gearboxs = gearboxs;
    }

    public Integer getCount() {
	return count;
    }

    public void setCount(Integer count) {
	this.count = count;
    }

}
