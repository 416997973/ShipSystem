package com.wimoor.erp.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.common.pojo.entity.ImportRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ImportRecordMapper extends BaseMapper<ImportRecord>{

	List<ImportRecord> selectByShopid(@Param("shopid") String shopid,@Param("importtype") String importtype );
}
