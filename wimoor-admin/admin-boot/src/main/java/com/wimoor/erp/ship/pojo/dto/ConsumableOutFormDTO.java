package com.wimoor.erp.ship.pojo.dto;

import lombok.Data;

import java.util.List;
@Data
public class ConsumableOutFormDTO {
	List<ConsumableSkuDTO> skulist;
	List<PackageSkuDTO> pkglist;
	String warehouseid;
	String number;
	String shipmentid;
}
