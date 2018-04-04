package com.dao;

import java.io.IOException;
import java.util.List;

import com.model.OZ_USER_Model;
import com.model.OZ_USER_QueryVo;


public interface Oz_userMapper {

	public void insertUser(OZ_USER_Model user) throws IOException;
	public List<OZ_USER_Model> selectUser(OZ_USER_QueryVo user) throws IOException;
	public void deleteUser(OZ_USER_Model user) throws IOException;
	public void updateUser(OZ_USER_Model user) throws IOException;
	
}
