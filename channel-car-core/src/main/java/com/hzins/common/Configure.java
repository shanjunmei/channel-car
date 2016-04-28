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

import com.hzins.rpc.client.core.MediaType;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月6日 下午3:11:57
 * @version
 */
public class Configure {
    

    public static class Common {

	public final static boolean DEBUG = true;
	
	public  static String baseUrl = null;//http://192.168.10.38:8088

    }

  
    public static class Request {

	public final static int http_connection_timeout = 0;// ms为单位
							    // 默认为0，系统默认超时时间，根据操作系统而定

	public final static int http_read_timeout = 0;// ms为单位
						      // 默认为0，系统默认超时时间，根据操作系统而定

	public final static String userAgent = "Channel OpenApi Sdk";
	//车险身份标识
	public final static String skey="channel_plate_token";

	public final static String contentType = MediaType.application_json.value();
    }

}
