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

import java.lang.reflect.Field;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月21日 下午5:07:44
 * @version
 */
public class EntityUtils {

    public static String entity2form(Object obj) {
	Field[] fields = obj.getClass().getDeclaredFields();
	StringBuffer sb = null;
	for (Field field : fields) {

	    boolean accessible = field.isAccessible();
	    field.setAccessible(true);
	    String fieldName = field.getName();
	    Object val;
	    try {
		val = field.get(obj);
	    } catch (IllegalAccessException e) {
		throw new RuntimeException(e);
	    }
	    if(val==null){
		continue;
	    }
	    if (sb == null) {
		sb = new StringBuffer();
	    } else {
		sb.append("&");
	    }

	    sb.append(fieldName + "=" + val);

	    field.setAccessible(accessible);
	}

	return sb.toString();
    }
}
