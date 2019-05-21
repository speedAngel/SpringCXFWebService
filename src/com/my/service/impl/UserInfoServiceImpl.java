package com.my.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.jawin.COMException;
import org.springframework.stereotype.Service;

import com.my.configure.StringTool;
import com.my.configure._QccMicro;
import com.my.dao.INBRYDao;
import com.my.dao.IQGQHDMDao;
import com.my.entity.Msg;
import com.my.entity.NBRY;
import com.my.entity.QGQHDM;
import com.my.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	private static List<QGQHDM> QGQHDMlist = null;

	private static List<String> QHDMList = new ArrayList<String>();

	@Resource
	private INBRYDao NBRYDao;

	@Resource
	private IQGQHDMDao QGQHDMDao;

	@Override
	public Msg SaveUser(String LoginUser, String LoginPwd, String userName,
			String passWd, String deptName) {

		boolean flag = true;
		if (flag) {
			return Msg.success();
		} else {
			return Msg.fail("");
		}
	}

	public INBRYDao getNBRYDao() {
		return NBRYDao;
	}

	public void setNBRYDao(INBRYDao nBRYDao) {
		NBRYDao = nBRYDao;
	}

	public IQGQHDMDao getQGQHDMDao() {
		return QGQHDMDao;
	}

	public void setQGQHDMDao(IQGQHDMDao qGQHDMDao) {
		QGQHDMDao = qGQHDMDao;
	}

}
