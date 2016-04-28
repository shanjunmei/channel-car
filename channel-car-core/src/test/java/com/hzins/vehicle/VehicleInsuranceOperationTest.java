/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.vehicle;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hzins.car.VehicleInsuranceOperation;
import com.hzins.car.model.info.AreaInfo;
import com.hzins.car.model.info.BranchInfo;
import com.hzins.car.model.rep.DoOfflinePayRep;
import com.hzins.car.model.rep.CarProtectItemInfo;
import com.hzins.car.model.rep.GetCarInvalidDateByPlateNumRep;
import com.hzins.car.model.rep.GetPayWayRep;
import com.hzins.car.model.rep.SaveBasicEnquiryRep;
import com.hzins.car.model.rep.SaveBasicInsureRep;
import com.hzins.car.model.rep.UpdateBasicInsureRep;
import com.hzins.car.model.req.SearchCarListReq;
import com.hzins.car.model.req.DoOfflinePayReq;
import com.hzins.car.model.req.GetAllCarProtectItemsByParamsReq;
import com.hzins.car.model.req.GetCarInvalidDateByPlateNumReq;
import com.hzins.car.model.req.GetPayWayReq;
import com.hzins.car.model.req.SaveBasicEnquiryReq;
import com.hzins.car.model.req.SaveBasicInsureReq;
import com.hzins.car.model.req.UpdateBasicInsureReq;
import com.hzins.car.model.req.UpdatePayFinishStateReq;
import com.hzins.common.Rep;
import com.hzins.rpc.client.core.ProxyFactory;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 上午11:29:37
 * @version
 */
public class VehicleInsuranceOperationTest {

    static VehicleInsuranceOperation operation = ProxyFactory.createRpcProxy(VehicleInsuranceOperation.class);

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testGetCarInvalidDateByPlateNum() throws JsonProcessingException {
	GetCarInvalidDateByPlateNumReq req = new GetCarInvalidDateByPlateNumReq();

	req.setPlateNum("粤B123");

	Rep<GetCarInvalidDateByPlateNumRep> rep = operation.getCarInvalidDateByPlateNum(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testGetAllCarProtectItemsByParams() throws JsonProcessingException {
	GetAllCarProtectItemsByParamsReq req =new GetAllCarProtectItemsByParamsReq();

	//req.setBranchId(46);
	//req.setAreaNum("9999");

	try {
	    Rep<List<CarProtectItemInfo>> rep = operation.getAllCarProtectItemsByParams(req);

	    System.out.println(objectMapper.writeValueAsString(rep));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    @Test
    public void testsaveBasicEnquiry() throws JsonProcessingException {
	SaveBasicEnquiryReq req = new SaveBasicEnquiryReq();

	Rep<SaveBasicEnquiryRep> rep = operation.saveBasicEnquiry(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testsaveBasicInsure() throws JsonProcessingException {
	SaveBasicInsureReq req = new SaveBasicInsureReq();

	Rep<SaveBasicInsureRep> rep = operation.saveBasicInsure(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testupdateBasicInsure() throws JsonProcessingException {
	UpdateBasicInsureReq req = new UpdateBasicInsureReq();

	Rep<UpdateBasicInsureRep> rep = operation.updateBasicInsure(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testupdatePayFinishState() throws JsonProcessingException {
	UpdatePayFinishStateReq req = new UpdatePayFinishStateReq();

	Rep<Boolean> rep = operation.updatePayFinishState(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testgetAreaListByBranchId() throws JsonProcessingException {
	Rep<List<String>> rep = operation.getAreaListByBranchId(46);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testrescindInsure() throws JsonProcessingException {
	Rep<Boolean> rep = operation.rescindInsure("3");

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testsearchCarList() throws JsonProcessingException {
	SearchCarListReq req = new SearchCarListReq();
	req.setKeyword("bmw");
	req.setPageNo(0+"");
	req.setPageSize(Integer.MAX_VALUE+"");
	Object rep = operation.searchCarList(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testgetCategoryArea() throws JsonProcessingException {

	Rep<List<AreaInfo>> rep = operation.getCategoryArea();

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testgetgetPayWay() throws JsonProcessingException {
	GetPayWayReq req = new GetPayWayReq();
	req.setBranchId(46);
	req.setEnquiryNum("333");
	req.setFlatNo(1);
	req.setInsureNum("33");
	Rep<GetPayWayRep> rep = operation.getPayWay(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testdoOfflinePay() throws JsonProcessingException {
	DoOfflinePayReq req = new DoOfflinePayReq();
	req.setInsureNum("33");
	req.setConsumeType("1");
	Rep<DoOfflinePayRep> rep = operation.doOfflinePay(req);
	System.out.println(objectMapper.writeValueAsString(rep));
    }
    
    
    @Test
    public void testgetBranchsByAreaId() throws JsonProcessingException {
	String req="440300";
	Rep<List<BranchInfo>> rep = operation.getBranchsByAreaId(req);
	System.out.println(objectMapper.writeValueAsString(rep));
    }
}
