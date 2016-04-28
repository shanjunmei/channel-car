/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.rpc.client.core.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.hzins.common.Configure;
import com.hzins.rpc.client.core.EntityUtils;
import com.hzins.rpc.client.core.MediaType;
import com.hzins.rpc.client.core.ServiceInfo;

/**
 * <p>
 * 
 * 远程方法调用
 *
 * </p>
 * 
 * @author 李淼淼
 * @date 2016年1月7日 上午8:00:52
 * @version
 */
public class HttpRemoteInvoker extends AbstractRemoteInvoker {

    @Override
    public <T> T invoke(Type returnType, Object _url, Object obj, ServiceInfo serverInfo) {
	MediaType requestMediaType = serverInfo.requestMediaType();
	HttpURLConnection connection = null;

	try {
	    URL url = new URL(_url.toString());
	    connection = (HttpURLConnection) url.openConnection();

	    byte[] p = null;
	    if (!MediaType._null.equals(requestMediaType)) {
		connection.addRequestProperty("Content-Type", requestMediaType.value());
	    }

	    connection.addRequestProperty("User-Agent", Configure.Request.userAgent);
	    connection.addRequestProperty("plateFlag", Configure.Request.skey);
	    connection.setConnectTimeout(Configure.Request.http_connection_timeout);
	    connection.setReadTimeout(Configure.Request.http_read_timeout);
	    connection.setRequestMethod("POST");
	    connection.setDoOutput(true);

	    if (MediaType._null.equals(requestMediaType)) {
		p = EntityUtils.entity2form(obj).getBytes();
	    } else if (MediaType.text_html.equals(requestMediaType)) {
		// p=EntityUtils.entity2form(obj).getBytes();
	    } else if (MediaType.application_json.equals(requestMediaType)) {
		p = objectMapper.writeValueAsBytes(obj);
	    }

	    // connection.getOutputStream().write(urlparam.getBytes());
	    // objectMapper.writeValue(connection.getOutputStream(), obj);
	    connection.getOutputStream().write(p);

	    int status = connection.getResponseCode();

	    if (status == 200) {
		//int len = Integer.parseInt(connection.getHeaderField("Content-Length"));
		//if (len > 0) {
		    T res = buildResponse(returnType, connection.getInputStream());
		    close(connection);
		    return res;
		/*} else {
		    return null;
		}*/

	    } else {
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream(), "utf-8"));
		StringBuffer message = new StringBuffer();
		while (reader.ready()) {
		    message.append(reader.readLine());
		}
		throw new RuntimeException(message.toString());
	    }
	} catch (MalformedURLException e) {
	    throw new RuntimeException(e);
	} catch (IOException e) {
	    throw new RuntimeException(e);
	} finally {
	    close(connection);
	}

    }

    /**
     * 
     * <p>
     * 
     *关闭连接
     *
     * </p>
     * @param connection
     *  
     * @author	hz15101769 
     * @date	2016年4月8日 上午10:02:53
     * @version
     */
    private void close(HttpURLConnection connection) {
	if (connection != null) {
	    try {
		connection.disconnect();
	    } catch (Exception e) {
		// ignore connection disconect exception
	    }
	}
    }

}
