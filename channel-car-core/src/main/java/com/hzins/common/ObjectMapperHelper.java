/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>
 * 
 * json 转换工具类
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月25日 上午8:49:55
 * @version
 */
public class ObjectMapperHelper {

    public static String toJson(ObjectMapper objectMapper, Object obj) {
	String json;
	try {
	    json = objectMapper.writeValueAsString(obj);
	} catch (JsonProcessingException e) {
	    throw new RuntimeException(e);
	}
	return json;
    }

    public static <T> T toBean(ObjectMapper objectMapper, Class<T> cls, String json) {
	T t = null;
	try {
	    t = (T) objectMapper.readValue(json, cls);
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
	return t;

    }

}
