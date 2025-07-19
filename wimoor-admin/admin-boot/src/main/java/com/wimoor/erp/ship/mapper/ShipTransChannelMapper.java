package com.wimoor.erp.ship.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.ship.pojo.entity.ShipTransChannel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ShipTransChannelMapper  extends BaseMapper<ShipTransChannel> {
	List<ShipTransChannel> selectListByshopid(@Param("shopid")String shopid,@Param("name")String name);
}