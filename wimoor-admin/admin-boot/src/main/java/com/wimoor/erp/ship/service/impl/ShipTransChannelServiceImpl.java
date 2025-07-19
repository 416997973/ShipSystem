package com.wimoor.erp.ship.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.erp.ship.mapper.ShipTransChannelMapper;
import com.wimoor.erp.ship.pojo.entity.ShipTransChannel;
import com.wimoor.erp.ship.service.IShipTransChannelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("shipTransChannelService")
public class ShipTransChannelServiceImpl extends  ServiceImpl<ShipTransChannelMapper,ShipTransChannel> implements IShipTransChannelService {
     
	@Override
	public List<ShipTransChannel> selectByshopid(String shopid,String name) {
		// TODO Auto-generated method stub
		return this.baseMapper.selectListByshopid(shopid,name);
	}

}
