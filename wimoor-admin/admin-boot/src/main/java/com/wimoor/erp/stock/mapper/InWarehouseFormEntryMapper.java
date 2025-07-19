package com.wimoor.erp.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.stock.pojo.entity.InWarehouseFormEntry;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface InWarehouseFormEntryMapper extends BaseMapper<InWarehouseFormEntry> {

	List<Map<String, Object>> selectByFormid(String formid);
 

	void deleteByFormid(String formid);

	List<Map<String, Object>> findFormDetailByFormid(String formid);
}