/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car.model.enums;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月15日 上午11:40:53
 * @version
 */
public enum CarPlatform {

    H5(1), PC(0);

    private Integer value;

    private CarPlatform(Integer value) {
	this.value = value;
    }

    public Integer getValue() {
	return value;
    }

    public static CarPlatform getByName(String name) {
	CarPlatform pv = null;
	for (CarPlatform p : CarPlatform.values()) {
	    if (p.name().equals(name)) {
		pv = p;
	    }
	}
	return pv;
    }

}
