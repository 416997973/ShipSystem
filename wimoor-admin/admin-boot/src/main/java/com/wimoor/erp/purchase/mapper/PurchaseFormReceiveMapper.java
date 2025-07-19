package com.wimoor.erp.purchase.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wimoor.erp.purchase.pojo.entity.PurchaseFormReceive;
import com.wimoor.erp.purchase.pojo.vo.PurchaseFormReceiveVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface PurchaseFormReceiveMapper extends BaseMapper<PurchaseFormReceive> {

	  List<Map<String,Object>> selectByEntryid(@Param("formentryid")String formentryid,@Param("ftype")String ftype);
	  IPage<PurchaseFormReceiveVo> receiveReport(IPage<?> page,@Param("param")Map<String, Object> param);
	  Integer receiveReportSummary(@Param("param")Map<String, Object> param);
	  List<PurchaseFormReceiveVo> receiveReport(@Param("param")Map<String, Object> param);
	  Integer refreshInbound(@Param("warehouseid")String warehouseid,@Param("materialid")String materialid);
	  Map<String,Object> receiveQty(@Param("formentryid")String formentryid);
      Map<String,Object> receiveInfo(@Param("id") String id);
      List<PurchaseFormReceive> findReceiveByConsumableForm(@Param("id") String id);
      List<Map<String, Object>> getSkuListByRunid(@Param("runid")String runid,@Param("shopid")String shopid);
}