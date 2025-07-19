package com.wimoor.erp.material.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.material.pojo.entity.ERPMaterialHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface ERPMaterialHistoryMapper extends BaseMapper<ERPMaterialHistory>{

	List<Map<String,Object>> selectProPriceHisById(String id);
    
}