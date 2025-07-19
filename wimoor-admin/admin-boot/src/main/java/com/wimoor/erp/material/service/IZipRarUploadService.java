package com.wimoor.erp.material.service;


import com.wimoor.common.user.UserInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface IZipRarUploadService {
	public List<String> uploadZipOrRar(UserInfo user, MultipartFile file, String ftype, String name);
	
	public String copyFolder(String oldPath, String newPath, String newFileName);
}
