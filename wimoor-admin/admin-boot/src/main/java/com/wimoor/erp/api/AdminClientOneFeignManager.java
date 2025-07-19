package com.wimoor.erp.api;

import cn.hutool.core.bean.BeanUtil;
import com.wimoor.admin.controller.DictItemController;
import com.wimoor.admin.controller.UserController;
import com.wimoor.common.result.Result;
import com.wimoor.common.user.UserInfo;
import com.wimoor.sys.tool.controller.SysTagsController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


 
@Component
public class AdminClientOneFeignManager {
    /**
     * eureka-client-one的helloworld访问mapping
     */

	@Autowired
	UserController userController;

	@Autowired
	DictItemController dictItemController;

	@Autowired
	SysTagsController sysTagsController;

	
    public Result<Map<String,Object>> getUserByUserId(  String userid){
    	 Result<UserInfo> user = userController.getUserByUserId(userid);
    	 if(user!=null&&user.getData()!=null) {
    		 return Result.success(BeanUtil.beanToMap(user.getData()));
    	 }else {
    		 return Result.failed();
    	 }
    }
    public Map<String,String> listType(String typeCode) {
    	Result<?> result = dictItemController.listType(typeCode);
    	Map<String,String> nameMap=new HashMap<String,String>();
    	if(Result.isSuccess(result)&&result.getData()!=null) {
    		@SuppressWarnings("unchecked")
			List<Map<String, Object>> list =  (List<Map<String, Object>>) result.getData();
    		for(Map<String, Object> item:list) {
    			nameMap.put(item.get("name").toString(), item.get("value").toString());
    		}
    		return nameMap;
    	}
    	return null;
    }
	
	public Result<UserInfo> getUserAllByUserId(  String userid){
		return  userController.getUserByUserId(userid);
	}
	
	public Result<List<Map<String,Object>>> findTagsNameByIds(  Set<String> tagsIdsList){
		return sysTagsController.listName(tagsIdsList);
	}
  	public Result<Map<String, Object>> findTagsName(  String shopid){
  		return sysTagsController.findTagsName(shopid);
  	}
     
    public String getUserName(String userid){
    	Result<Map<String,String>> result= userController.getNameMap();
    	if(Result.isSuccess(result)&&result.getData()!=null) {
    		return result.getData().get(userid);
    	}
		return null;
    }
    
    public Map<String,String> getAllUserName(){
    	Result<Map<String,String>> result= userController.getNameMap();
    	if(Result.isSuccess(result)&&result.getData()!=null) {
    		return result.getData();
    	}
		return new HashMap<String,String>();
    }
    
   public Map<String,String> findOwnerAllAction() {
	   Result<List<Map<String, Object>>> response= userController.findOwnerAllAction();
	   Map<String,String> map=new HashMap<String,String>();
	   if(Result.isSuccess(response)&&response.getData()!=null) {
		   List<Map<String, Object>> list = response.getData();
		   for(Map<String, Object> item:list) { 
			  map.put(item.get("name").toString(), item.get("id").toString()); 
		   }
	   }
	   return map;
   }
}