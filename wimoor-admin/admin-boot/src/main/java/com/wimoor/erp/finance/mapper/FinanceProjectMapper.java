package com.wimoor.erp.finance.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.finance.pojo.entity.FinanceProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FinanceProjectMapper extends BaseMapper<FinanceProject> {

	List<FinanceProject> findProject(@Param("shopid")String shopid);

	List<FinanceProject> findProList(@Param("shopid")String shopid,@Param("search")String search);
     
}