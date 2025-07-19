package com.wimoor.erp.purchase.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.purchase.pojo.entity.PurchasePlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface PurchasePlanMapper extends BaseMapper<PurchasePlan> {

	List<Map<String, Object>> getPurchasePlanForShopId(@Param("shopid") String shopid);
	
}