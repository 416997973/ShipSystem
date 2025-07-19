package com.wimoor.erp.material.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.material.pojo.entity.StockCycle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface StockCycleMapper extends BaseMapper<StockCycle> {

	List<Map<String, Object>> selectByMaterial(String materialid);

	void deleteByMaterial(String materialid);
}