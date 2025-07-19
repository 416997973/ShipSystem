package com.wimoor.erp.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.common.service.IPictureService;
import com.wimoor.common.service.impl.StorageService;
import com.wimoor.erp.common.mapper.ImportRecordMapper;
import com.wimoor.erp.common.pojo.entity.ImportRecord;
import com.wimoor.erp.common.service.IImportRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("importRecordService")
@RequiredArgsConstructor
public class ImportRecordServiceImpl extends ServiceImpl<ImportRecordMapper, ImportRecord> implements IImportRecordService{
	
	final IPictureService pictureService;
	final StorageService storageService;
	
	@Override
	public List<ImportRecord> getImportRecord(String shopid, String importtype) {
		return this.baseMapper.selectByShopid(shopid, importtype);
	}



}
