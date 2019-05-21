package com.my.entity;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	
	//状态码
	private int code;
	
	//提示信息
	private String msg;
	
	//用户要返回浏览的数据	
	//private Map<String, Object> extend=new 	HashMap<String, Object>();

	
	public static Msg success() {
		Msg ret=new Msg();
		ret.setCode(100);
		ret.setMsg("成功！");	
		return ret;		
	}
	
	public static Msg fail(String error) {
		Msg ret=new Msg();
		ret.setCode(200);
		ret.setMsg(error);
		return ret;		
	}
	
//	public Msg add(String key,Object value) {
//		this.getExtend().put(key, value);
//		return this;
//	}
//	
//	public Map<String, Object> getExtend() {
//		return extend;
//	}
//
//	public void setExtend(Map<String, Object> extend) {
//		this.extend = extend;
//	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}


