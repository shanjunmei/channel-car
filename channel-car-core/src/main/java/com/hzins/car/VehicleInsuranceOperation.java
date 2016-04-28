/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car;

import java.util.List;

import com.hzins.car.model.info.AreaInfo;
import com.hzins.car.model.info.BranchInfo;
import com.hzins.car.model.rep.CarProtectItemInfo;
import com.hzins.car.model.rep.DoOfflinePayRep;
import com.hzins.car.model.rep.GetCarInvalidDateByPlateNumRep;
import com.hzins.car.model.rep.GetPayWayRep;
import com.hzins.car.model.rep.SaveBasicEnquiryRep;
import com.hzins.car.model.rep.SaveBasicInsureRep;
import com.hzins.car.model.rep.SearchCarListRep;
import com.hzins.car.model.rep.UpdateBasicInsureRep;
import com.hzins.car.model.req.DoOfflinePayReq;
import com.hzins.car.model.req.GetAllCarProtectItemsByParamsReq;
import com.hzins.car.model.req.GetCarInvalidDateByPlateNumReq;
import com.hzins.car.model.req.GetPayWayReq;
import com.hzins.car.model.req.SaveBasicEnquiryReq;
import com.hzins.car.model.req.SaveBasicInsureReq;
import com.hzins.car.model.req.SearchCarListReq;
import com.hzins.car.model.req.UpdateBasicInsureReq;
import com.hzins.car.model.req.UpdatePayFinishStateReq;
import com.hzins.common.Rep;
import com.hzins.rpc.client.core.Command;
import com.hzins.rpc.client.core.ParameterType;
import com.hzins.rpc.client.core.ServiceInfo;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 上午11:19:34
 * @version
 */
@ServiceInfo(parameterType = ParameterType.ARRAY)
public interface VehicleInsuranceOperation {

    /**
     * 
     * <p>
     * 
     * 根据车牌号获取终保日期
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:09:34
     * @version
     */
    public Rep<GetCarInvalidDateByPlateNumRep> getCarInvalidDateByPlateNum(GetCarInvalidDateByPlateNumReq req);

    /**
     * 
     * <p>
     * 
     * 获取保障项目
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:09:40
     * @version
     */
    public Rep<List<CarProtectItemInfo>> getAllCarProtectItemsByParams(GetAllCarProtectItemsByParamsReq req);

    /**
     * 
     * <p>
     * 
     * 询价信息保存
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:10:03
     * @version
     */
    public Rep<SaveBasicEnquiryRep> saveBasicEnquiry(SaveBasicEnquiryReq req);

    /**
     * 
     * <p>
     * 
     * 投保
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:10:16
     * @version
     */
    public Rep<SaveBasicInsureRep> saveBasicInsure(SaveBasicInsureReq req);

    /**
     * 
     * <p>
     * 
     * 修改投保信息
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:09:19
     * @version
     */
    public Rep<UpdateBasicInsureRep> updateBasicInsure(UpdateBasicInsureReq req);

    /**
     * 
     * <p>
     * 
     * 修改支付状态
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:20:18
     * @version
     */
    public Rep<Boolean> updatePayFinishState(UpdatePayFinishStateReq req);

    /**
     * 
     * <p>
     * 
     * 根据分支机构id获取可投保地市信息（包含省级信息）
     *
     * </p>
     * 
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:36:47
     * @version
     */
    public Rep<List<String>> getAreaListByBranchId(Integer req);

    /**
     * 
     * <p>
     * 
     * 撤销投保
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:44:03
     * @version
     */
    public Rep<Boolean> rescindInsure(String req);

    /**
     * 
     * <p>
     * 
     * 车库信息查询
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年4月8日 上午10:05:15
     * @version
     */
    @Command("searchCarList")
    // @ServiceInfo(value = "http://192.168.10.38:8088", type = RpcType.HTTP,
    // parameterType = ParameterType.Object, transferMode = TransferMode.OUT,
    // requestMediaType = MediaType._null)
    public SearchCarListRep searchCarList(SearchCarListReq req);// CarreposSearchRep

    /**
     * 
     * <p>
     * 
     * 获取可投保区域
     *
     * </p>
     * 
     * @return
     * 
     * @author hz15101769
     * @date 2016年4月8日 上午11:03:26
     * @version
     */
    public Rep<List<AreaInfo>> getCategoryArea();

    /**
     * 
     * <p>
     * 
     * 获取支付方式
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年4月8日 上午11:17:48
     * @version
     */
    public Rep<GetPayWayRep> getPayWay(GetPayWayReq req);

    /**
     * 
     * <p>
     * 
     * 线下支付
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年4月8日 上午11:38:06
     * @version
     */
    public Rep<DoOfflinePayRep> doOfflinePay(DoOfflinePayReq req);

    /**
     * 
     * <p>
     * 
     * 根据区域编码获取分支机构列表
     *
     * </p>
     * 
     * @param areaNum
     * @return
     * 
     * @author hz15101769
     * @date 2016年4月13日 下午5:36:24
     * @version
     */
    public Rep<List<BranchInfo>> getBranchsByAreaId(String areaNum);

}
