package com.my.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.my.annotation.DataSource;
import com.my.configure.DynamicDataSource;
import com.my.configure.StringTool;
import com.my.dao.IQGQHDMDao;
import com.my.entity.QGQHDM;


@Repository
@DataSource(DynamicDataSource.ComDataSource)
public class QGQHDMDaoImpl implements IQGQHDMDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	
	
}
