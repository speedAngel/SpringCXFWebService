package com.my.configure;



import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource{
	
	/**
	 * com库
	 */
	public static final String ComDataSource = "comDataSource";
	
	
	
	/**
	 * rol库
	 */
	public static final String RolDataSource = "rolDataSource";
	
	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceHolder.getDataSource();
	}

}
