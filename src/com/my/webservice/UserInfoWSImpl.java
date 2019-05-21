package com.my.webservice;

import javax.annotation.Resource;
import javax.jws.WebService;


import org.springframework.stereotype.Service;

import com.my.entity.Msg;
import com.my.service.UserInfoService;


@Service("userInfoWSImpl")
@WebService(endpointInterface = "com.orifound.webservice.UserInfoWS", serviceName = "userInfoWS")
public class UserInfoWSImpl implements  UserInfoWS{
	
	@Resource
	private UserInfoService userInfoService;
	
	
	
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}



	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}



	@Override
	public Msg SaveUser(String LoginUser, String LoginPwd, String userName,
			String passWd, String deptName) {
		return userInfoService.SaveUser(LoginUser,LoginPwd,userName, passWd, deptName);
	}

}
