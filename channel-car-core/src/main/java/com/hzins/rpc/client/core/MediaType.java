/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.rpc.client.core;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月21日 下午5:35:50
 * @version
 */
public enum MediaType {
    _null(null),
    all("*/*"),
    text_html("text/html"),
    application_json("application/json");

    private String value;

    private MediaType(String value) {
	this.value = value;
    }

    public String value() {
	return this.value;
    }

    // public final static String application_json="";

    // public final static String text_html="text/html";

}
