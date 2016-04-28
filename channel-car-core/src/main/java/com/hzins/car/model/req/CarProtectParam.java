package com.hzins.car.model.req;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz1412998
 * @date 2015年2月12日 上午11:18:21
 * @version
 */
public class CarProtectParam {


    private Integer protectItemId;// 保障项id,也是车险的险种id

    private String protectItemName;// 保障项名称

    private Byte isNoDeductible;// 是否不计免赔

    private Integer protectValueId;// 保障值id

    private float insureAmount;// 保额

    private String insureAmountUnit;// 保额单位

    private String insureText;// 文字说明（国产，进口，投保，不投保）

    private Byte seatNum;// 座位数

    private Integer companyId;// 公司id

    private float premium;// 保费

    private String insureValue;// 保额整个字段
    
    private byte flag;//0未报出价格1已报出价格

    
    
    
    public byte getFlag() {
        return flag;
    }


    
    public void setFlag(byte flag) {
        this.flag = flag;
    }


    public Integer getProtectItemId() {
        return protectItemId;
    }

    
    public void setProtectItemId(Integer protectItemId) {
        this.protectItemId = protectItemId;
    }

    
    public String getProtectItemName() {
        return protectItemName;
    }

    
    public void setProtectItemName(String protectItemName) {
        this.protectItemName = protectItemName;
    }

    
    public Byte getIsNoDeductible() {
        return isNoDeductible;
    }

    
    public void setIsNoDeductible(Byte isNoDeductible) {
        this.isNoDeductible = isNoDeductible;
    }

    
    public Integer getProtectValueId() {
        return protectValueId;
    }

    
    public void setProtectValueId(Integer protectValueId) {
        this.protectValueId = protectValueId;
    }

    

    
    public String getInsureAmountUnit() {
        return insureAmountUnit;
    }

    
    public void setInsureAmountUnit(String insureAmountUnit) {
        this.insureAmountUnit = insureAmountUnit;
    }

    
    public String getInsureText() {
        return insureText;
    }

    
    public void setInsureText(String insureText) {
        this.insureText = insureText;
    }

    
    public Byte getSeatNum() {
        return seatNum;
    }

    
    public void setSeatNum(Byte seatNum) {
        this.seatNum = seatNum;
    }

    
    public Integer getCompanyId() {
        return companyId;
    }

    
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
   
    
    
    public float getInsureAmount() {
        return insureAmount;
    }


    
    public void setInsureAmount(float insureAmount) {
        this.insureAmount = insureAmount;
    }


    
    public float getPremium() {
        return premium;
    }


    
    public void setPremium(float premium) {
        this.premium = premium;
    }


    public String getInsureValue() {
        return insureValue;
    }

    
    public void setInsureValue(String insureValue) {
        this.insureValue = insureValue;
    }

}
