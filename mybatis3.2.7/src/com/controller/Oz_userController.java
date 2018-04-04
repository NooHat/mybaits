package com.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.dao.Oz_userMapper;
import com.model.OZ_USER_Model;
import com.model.OZ_USER_QueryVo;

public class Oz_userController {
	private SqlSessionFactory ssf;
	@Before
	public void setup() throws IOException{
		//创建配置文件
		String resouce="SqlMapConfig.xml";
		//获取配置文件流
		InputStream input=Resources.getResourceAsStream(resouce);
		//创建会话工厂,传入mybatis配置文件信息
		 ssf=new SqlSessionFactoryBuilder().build(input);
	}
	//查询用户信息
	@Test
	public void findUserByName() throws IOException{
		SqlSession ss=ssf.openSession();
		OZ_USER_Model model=new OZ_USER_Model();
		model.setUsername("admin");
		OZ_USER_QueryVo oz_user_queryvo=new OZ_USER_QueryVo();
		oz_user_queryvo.setOz_user_model(model);
		Oz_userMapper oz_userMapper=ss.getMapper(Oz_userMapper.class);
		List<OZ_USER_Model> usermodel_list=oz_userMapper.selectUser(oz_user_queryvo);
		System.out.println(usermodel_list);
		
		ss.close();
	}
	
	//插入用户
	@Test
	public void insertUser() throws IOException{
		//创建配置文件
		String resouce="SqlMapConfig.xml";
		//获取配置文件流
		InputStream input=Resources.getResourceAsStream(resouce);
		//创建会话工厂,传入mybatis配置文件信息
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(input);
		//创建sql会话
		SqlSession sqlsession=sqlSessionFactory.openSession();
		
		OZ_USER_Model usermodel=new OZ_USER_Model();
		usermodel.setId(UUID.randomUUID().toString());
		usermodel.setUsername("nohat");
		usermodel.setPwd("111");
		sqlsession.insert("Oz_userMapper.insertUser",usermodel);
		sqlsession.commit();
		sqlsession.close();
		
	}
	//删除用户
	@Test
	public void deleteUser()throws IOException{
		//创建配置文件
				String resouce="SqlMapConfig.xml";
				//获取配置文件流
				InputStream input=Resources.getResourceAsStream(resouce);
				//创建会话工厂,传入mybatis配置文件信息
				SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(input);
				//创建sql会话
				SqlSession sqlsession=sqlSessionFactory.openSession();
				
				OZ_USER_Model usermodel=new OZ_USER_Model();
				usermodel.setUsername("nohat");
				sqlsession.delete("Oz_userMapper.deleteUser",usermodel);
				sqlsession.commit();
				sqlsession.close();	
		
		
	}
	    //更新用户
		@Test
		public void updateUser()throws IOException{
			//创建配置文件
			String resouce="SqlMapConfig.xml";
			//获取配置文件流
			InputStream input=Resources.getResourceAsStream(resouce);
			//创建会话工厂,传入mybatis配置文件信息
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(input);
			//创建sql会话
			SqlSession sqlsession=sqlSessionFactory.openSession();
			
			OZ_USER_Model usermodel=new OZ_USER_Model();
			usermodel.setUsername("nohat");
			usermodel.setPwd("sss");
			sqlsession.delete("Oz_userMapper.updateUser",usermodel);
			sqlsession.commit();
			sqlsession.close();	
		}
		
		
		
}
