package com.model;


   /**
    * OZ_USER 实体类
    * Fri Mar 30 10:04:29 CST 2018 wyd
    */ 


public class OZ_USER_Model {
		/**
		* 		*/ 
	private String pwd;
		/**
		* 		*/ 
	private String username;
		/**
		* 		*/ 
	private String id;
	public void setPwd(String pwd){
	this.pwd=pwd;
	}
	public String getPwd(){
		return pwd;
	}
	public void setUsername(String username){
	this.username=username;
	}
	public String getUsername(){
		return username;
	}
	public void setId(String id){
	this.id=id;
	}
	public String getId(){
		return id;
	}
	@Override
	public String toString() {
		return "OZ_USER_Model [pwd=" + pwd + ", username=" + username + ", id=" + id + "]";
	}
	
	
}

