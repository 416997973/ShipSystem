package com.wimoor.erp.purchase.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.purchase.pojo.entity.PurchaseFormEntryHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PurchaseFormEntryHistoryMapper extends BaseMapper<PurchaseFormEntryHistory>{
	 public List<Map<String,Object>> findHistoryById(@Param("id")String id);
}
