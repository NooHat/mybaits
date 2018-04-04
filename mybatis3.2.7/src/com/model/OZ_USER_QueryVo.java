package com.model;

import java.util.List;

/*** <p>Title:OZ_USER_QueryVo </p>
* <p>Description:用户查询实体类 </p>
* <p>Company: </p> 
* @author NooHat
* @date 2018年4月3日 上午11:03:05
*/
public class OZ_USER_QueryVo {
	
	private OZ_USER_Model oz_user_model;

	private List<String> ids;
	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public OZ_USER_Model getOz_user_model() {
		return oz_user_model;
	}

	public void setOz_user_model(OZ_USER_Model oz_user_model) {
		this.oz_user_model = oz_user_model;
	}
	
	
	
	
}
