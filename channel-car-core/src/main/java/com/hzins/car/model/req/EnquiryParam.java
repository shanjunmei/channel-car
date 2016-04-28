package com.hzins.car.model.req;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hzins.car.model.info.CarInfo;
import com.hzins.car.utils.DateTimeDeserializer;
import com.hzins.car.utils.DateTimeSerializer;

/**
 * 
 * <p>
 * 
 * 车险询价请求实体
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月14日 下午6:03:55
 * @version
 */
public class EnquiryParam {

    private long id;// id

    private String enquiryNum;// 询价单号

    private String insureNum;// 投保单号

    private Byte issueStatus;// 出单状态（1=未出单 2=已出单）

    private Byte payStatus;// 支付状态（1=待支付，2=待确认，3=已支付)

    private Byte insureStatus;// 状态： 0=初审中 1=初审失败 2=核保中 3=核保失败 5=核保成功 6=拒保 7=已过期
			      // 8=已撤销

    private Byte receivePayStatus;// 收款状态（1：待收款 2：已收款）

    private int platformUserId;// 平台用户id

    private String platformUserEmail;// 平台用户email

    private Byte platformFlag;// 慧择0，聚米1，保运通2

    private long carInfoId;// 车辆信息表id

    // @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date trafficInsureStartTime;// 交强险开始时间
    // @JSONField(format="yyyy-MM-dd HH:mm:ss")

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date trafficInsureEndTime;// 交强险结束时间
    // @JSONField(format="yyyy-MM-dd HH:mm:ss")

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date busiInsureStartTime;// 商业险开始时间
    // @JSONField(format="yyyy-MM-dd HH:mm:ss")

    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date busiInsureEndTime;// 商业险结束时间

    private byte insureSelectFlag;// 交强险或商业险选择判断（1，只选交强险，2，只选商业险，3，两者都选）

    private byte isBuyTravelTax;// 是否购买车船税（0，不购买，1购买）

    private List<Integer> onlineCompanyIds;// 线上公司id数组

    private List<CarProtectParam> carProtectParams;// 保障内容

    private CarInfo carInfo;

    private String cmd;// 用于rabbitmq路径

    private List<CompanyParam> companys;

    private byte isOnline;

    private byte deleted;

    // @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date createTime;

    // @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date updateTime;

    // @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date quoteTime;// 报价时间

    private long createUserId;

    private long updateUserId;

    private String discription;// 描述

    private Byte status = 0;

    private String bussinessInvalidDate;// 商业险原保单的失效时间

    private String strongInvalidDate;// 交强险原保单的失效时间

    private Integer branchId;// 人工报价时前端传来的分支机构id

    private int companyNum;// 报价公司的总数

    public int getCompanyNum() {
	return companyNum;
    }

    public void setCompanyNum(int companyNum) {
	this.companyNum = companyNum;
    }

    public Integer getBranchId() {
	return branchId;
    }

    public void setBranchId(Integer branchId) {
	this.branchId = branchId;
    }

    public String getBussinessInvalidDate() {
	return bussinessInvalidDate;
    }

    public void setBussinessInvalidDate(String bussinessInvalidDate) {
	this.bussinessInvalidDate = bussinessInvalidDate;
    }

    public String getStrongInvalidDate() {
	return strongInvalidDate;
    }

    public void setStrongInvalidDate(String strongInvalidDate) {
	this.strongInvalidDate = strongInvalidDate;
    }

    public byte getIsOnline() {
	return isOnline;
    }

    public void setIsOnline(byte isOnline) {
	this.isOnline = isOnline;
    }

    public Byte getPlatformFlag() {
	return platformFlag;
    }

    public void setPlatformFlag(Byte platformFlag) {
	this.platformFlag = platformFlag;
    }

    public Byte getReceivePayStatus() {
	return receivePayStatus;
    }

    public void setReceivePayStatus(Byte receivePayStatus) {
	this.receivePayStatus = receivePayStatus;
    }

    public Byte getIssueStatus() {
	return issueStatus;
    }

    public void setIssueStatus(Byte issueStatus) {
	this.issueStatus = issueStatus;
    }

    public Byte getPayStatus() {
	return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
	this.payStatus = payStatus;
    }

    public Byte getInsureStatus() {
	return insureStatus;
    }

    public void setInsureStatus(Byte insureStatus) {
	this.insureStatus = insureStatus;
    }

    public List<CompanyParam> getCompanys() {
	return companys;
    }

    public void setCompanys(List<CompanyParam> companys) {
	this.companys = companys;
    }

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

    public void setCreateUserId(Long createUserId) {
	this.createUserId = createUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
	this.updateUserId = updateUserId;
    }

    public byte getDeleted() {
	return deleted;
    }

    public void setDeleted(byte deleted) {
	this.deleted = deleted;
    }

    public String getDiscription() {
	return discription;
    }

    public void setDiscription(String discription) {
	this.discription = discription;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getEnquiryNum() {
	return enquiryNum;
    }

    public void setEnquiryNum(String enquiryNum) {
	this.enquiryNum = enquiryNum;
    }

    public String getPlatformUserEmail() {
	return platformUserEmail;
    }

    public void setPlatformUserEmail(String platformUserEmail) {
	this.platformUserEmail = platformUserEmail;
    }

    public long getCarInfoId() {
	return carInfoId;
    }

    public void setCarInfoId(long carInfoId) {
	this.carInfoId = carInfoId;
    }

    public Date getTrafficInsureStartTime() {
	return trafficInsureStartTime;
    }

    public void setTrafficInsureStartTime(Date trafficInsureStartTime) {
	this.trafficInsureStartTime = trafficInsureStartTime;
    }

    public Date getTrafficInsureEndTime() {
	Calendar cal = Calendar.getInstance();
	if (trafficInsureStartTime != null) {
	    cal.setTime(trafficInsureStartTime);
	    cal.add(Calendar.YEAR, 1);
	    cal.add(Calendar.SECOND, -1);
	    trafficInsureEndTime = cal.getTime();
	}

	return trafficInsureEndTime;
    }

    public void setTrafficInsureEndTime(Date trafficInsureEndTime) {
	this.trafficInsureEndTime = trafficInsureEndTime;
    }

    public Date getBusiInsureStartTime() {
	return busiInsureStartTime;
    }

    public void setBusiInsureStartTime(Date busiInsureStartTime) {
	this.busiInsureStartTime = busiInsureStartTime;
    }

    public Date getBusiInsureEndTime() {
	Calendar cal = Calendar.getInstance();
	if (busiInsureStartTime != null) {
	    cal.setTime(busiInsureStartTime);
	    cal.add(Calendar.YEAR, 1);
	    cal.add(Calendar.SECOND, -1);
	    busiInsureEndTime = cal.getTime();
	}
	return busiInsureEndTime;
    }

    public void setBusiInsureEndTime(Date busiInsureEndTime) {
	this.busiInsureEndTime = busiInsureEndTime;
    }

    public byte getInsureSelectFlag() {
	return insureSelectFlag;
    }

    public void setInsureSelectFlag(byte insureSelectFlag) {
	this.insureSelectFlag = insureSelectFlag;
    }

    public byte getIsBuyTravelTax() {
	return isBuyTravelTax;
    }

    public void setIsBuyTravelTax(byte isBuyTravelTax) {
	this.isBuyTravelTax = isBuyTravelTax;
    }

    public List<CarProtectParam> getCarProtectParams() {
	return carProtectParams;
    }

    public void setCarProtectParams(List<CarProtectParam> carProtectParams) {
	this.carProtectParams = carProtectParams;
    }

    public Date getQuoteTime() {
	return quoteTime;
    }

    public void setQuoteTime(Date quoteTime) {
	this.quoteTime = quoteTime;
    }

    public int getPlatformUserId() {
	return platformUserId;
    }

    public void setPlatformUserId(int platformUserId) {
	this.platformUserId = platformUserId;
    }

    public Byte getStatus() {
	return status;
    }

    public void setStatus(Byte status) {
	this.status = status;
    }

    public CarInfo getCarInfo() {
	return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
	this.carInfo = carInfo;
    }

    public String getCmd() {
	return cmd;
    }

    public void setCmd(String cmd) {
	this.cmd = cmd;
    }

    public Date getCreateTime() {
	return createTime;
    }

    public void setCreateTime(Date createTime) {
	this.createTime = createTime;
    }

    public Date getUpdateTime() {
	return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
    }

    public long getCreateUserId() {
	return createUserId;
    }

    public void setCreateUserId(long createUserId) {
	this.createUserId = createUserId;
    }

    public long getUpdateUserId() {
	return updateUserId;
    }

    public void setUpdateUserId(long updateUserId) {
	this.updateUserId = updateUserId;
    }

    public List<Integer> getOnlineCompanyIds() {
	return onlineCompanyIds;
    }

    public void setOnlineCompanyIds(List<Integer> onlineCompanyIds) {
	this.onlineCompanyIds = onlineCompanyIds;
    }

}
