package com.my.webservice;

import javax.jws.WebService;

import com.my.entity.Msg;

@WebService
public interface UserInfoWS {
	
	public Msg SaveUser(String LoginUser,String LoginPwd, String userName, String passWd, String deptName);
}
