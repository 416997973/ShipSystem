package com.wimoor.erp.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.erp.common.pojo.entity.ImportRecord;

import java.util.List;

 

public interface IImportRecordService extends IService<ImportRecord>{

	List<ImportRecord> getImportRecord(String shopid, String importtype);

}
