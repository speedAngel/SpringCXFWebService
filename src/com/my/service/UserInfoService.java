package com.my.service;



import com.my.entity.Msg;


public interface UserInfoService {
	Msg SaveUser(String LoginUser, String LoginPwd, String userName,
			String passWd, String deptName);
}
