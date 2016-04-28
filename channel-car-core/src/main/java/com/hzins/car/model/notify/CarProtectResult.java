package com.hzins.car.model.notify;

/**
 * 
 * <p>
 * 
 *保障项目
 *
 * </p>
 *  
 * @author	hz15101769 
 * @date	2016年4月14日 下午5:07:28
 * @version
 */
public class CarProtectResult {

    private int protectItemId;// 保障项id,也是车险的险种id

    private String protectItemName;// 保障项名称

    private Byte isNoDeductible;// 是否不计免赔

    private String insureValue;// 保额

    private float premium;// 保费

    public String getProtectItemName() {
	return protectItemName;
    }

    public void setProtectItemName(String protectItemName) {
	this.protectItemName = protectItemName;
    }

    public int getProtectItemId() {
	return protectItemId;
    }

    public void setProtectItemId(int protectItemId) {
	this.protectItemId = protectItemId;
    }

    public Byte getIsNoDeductible() {
	return isNoDeductible;
    }

    public void setIsNoDeductible(Byte isNoDeductible) {
	this.isNoDeductible = isNoDeductible;
    }

    public String getInsureValue() {
	return insureValue;
    }

    public void setInsureValue(String insureValue) {
	this.insureValue = insureValue;
    }

    public float getPremium() {
	return premium;
    }

    public void setPremium(float premium) {
	this.premium = premium;
    }

}