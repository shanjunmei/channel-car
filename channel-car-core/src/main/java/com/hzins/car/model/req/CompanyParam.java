package com.hzins.car.model.req; 

/**
 * 
 * <p>
 * 
 *
 *
 * </p>
 *  
 * @author	hz15101769 
 * @date	2016年4月14日 下午6:04:15
 * @version
 */
public class CompanyParam {

    private Integer companyId;
    private Integer branchId;//前端传的分支机构id
    private String companyName;
    private String shortName;
    private boolean isOnline;
    private String branchName;
    
    private  String companySimpleName;
    
    private  String smallLogoImg;//公司logo小图
    
    private String mobileLogoImg;//移动图片

    private  Byte defaultOffer;

    private  Byte autoOffer;
    
    
    private  String offerAreaStr;

    private  String offerAreaId;
    
    
    
    
    
    public String getOfferAreaStr() {
        return offerAreaStr;
    }





    
    public void setOfferAreaStr(String offerAreaStr) {
        this.offerAreaStr = offerAreaStr;
    }





    
    public String getOfferAreaId() {
        return offerAreaId;
    }





    
    public void setOfferAreaId(String offerAreaId) {
        this.offerAreaId = offerAreaId;
    }





    public String getMobileLogoImg() {
        return mobileLogoImg;
    }




    
    public void setMobileLogoImg(String mobileLogoImg) {
        this.mobileLogoImg = mobileLogoImg;
    }




    public Integer getBranchId() {
        return branchId;
    }



    
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }



    public String getBranchName() {
        return branchName;
    }


    
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }




    
    public String getCompanySimpleName() {
        return companySimpleName;
    }




    
    public void setCompanySimpleName(String companySimpleName) {
        this.companySimpleName = companySimpleName;
    }




    public String getSmallLogoImg() {
        return smallLogoImg;
    }


    
    public void setSmallLogoImg(String smallLogoImg) {
        this.smallLogoImg = smallLogoImg;
    }


    
    public Byte getDefaultOffer() {
        return defaultOffer;
    }


    
    public void setDefaultOffer(Byte defaultOffer) {
        this.defaultOffer = defaultOffer;
    }


    
    public Byte getAutoOffer() {
        return autoOffer;
    }


    
    public void setAutoOffer(Byte autoOffer) {
        this.autoOffer = autoOffer;
    }


    public boolean isOnline() {
        return isOnline;
    }

    
    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

 
 
    
    
    public Integer getCompanyId() {
        return companyId;
    }


    
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }


    

    


    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getShortName() {
        return shortName;
    }
    
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
    
 