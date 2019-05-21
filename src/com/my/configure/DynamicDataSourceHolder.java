package com.my.configure;

public class DynamicDataSourceHolder {
	/**
	 * 注意：数据源标识保存在线程变量中，避免多线程操作数据源时互相干扰
	 */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();  
    /** 
     * @Description: 清除数据源类型 
     * @param  
     * @return void 
     * @throws 
     */  
    public static void clearDataSource() {  
        contextHolder.remove();  
    }  
      
    /** 
     * @Description: 获取数据源类型 
     * @param  
     * @return String 
     * @throws 
     */  
    public static String getDataSource() {  
        return contextHolder.get();  
    }  
      
    /** 
     * @Description: 设置数据源类型 
     * @param dataSourceType  数据库类型 
     * @return void 
     * @throws 
     */  
    public static void setDataSource(String dataSource) {  
        contextHolder.set(dataSource);  
    }  
}
