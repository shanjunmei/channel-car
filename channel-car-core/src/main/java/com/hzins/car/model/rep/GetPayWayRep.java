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

/**
 * <p>
 * 
 *获取支付方式
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月8日 上午11:15:36
 * @version
 */
public class GetPayWayRep {

    private Integer payWay;// ":0 //0:线上（即支付到保险公司） 1:线下（即支付到慧择）

    private String url;// ":”http://localhost”
		       // //如果是线上支付，跳转到保险公司的支付页面，如果是线下支付，调用接口2.投保单支付

    
    public Integer getPayWay() {
        return payWay;
    }

    
    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    
    public String getUrl() {
        return url;
    }

    
    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
