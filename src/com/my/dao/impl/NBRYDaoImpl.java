package com.my.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.my.annotation.DataSource;
import com.my.configure.DynamicDataSource;
import com.my.dao.INBRYDao;
import com.my.entity.NBRY;


@Repository
@DataSource(DynamicDataSource.RolDataSource)
public class NBRYDaoImpl  implements INBRYDao{
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
