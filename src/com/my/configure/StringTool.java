package com.my.configure;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * Title: StringTool 字符串工具类
 * </p>
 * <p>
 * Description: 提供对字符串的各种操作
 * </p>
 */

public abstract class StringTool {

	/**
	 * 检测字符串是否为空
	 * <p>
	 * 不为空返回true
	 * </p>
	 * 
	 * @param string
	 *            监测的字符串
	 * @return boolean
	 */
	public static boolean isNotNull(String string) {
		if (string != null && !string.trim().isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * 取出字符串前后的空格
	 * 
	 * @param string
	 * @return
	 */
	public static String trimSpace(String string) {
		if (isNotNull(string)) {
			return string.trim();
		} else {
			return "";
		}
	}

	/**
	 * 如果字符串为空，返回"" 否则返回原值
	 * 
	 * @param value
	 * @return
	 */
	public static String checkNullReturn(String value) {
		String returnValue = "";
		if (StringTool.isNotNull(value)) {
			returnValue = value;
		}
		return returnValue;
	}

	private static final int BUFFER_SIZE = 16 * 1024;

	/**
	 * 自己封装的一个把源文件对象复制成目标文件对象
	 */
	public static boolean copy(File src, File dst) {
		boolean result = false;
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(src), BUFFER_SIZE);
			out = new BufferedOutputStream(new FileOutputStream(dst),
					BUFFER_SIZE);
			byte[] buffer = new byte[BUFFER_SIZE];
			int len = 0;
			while ((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != out) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * 获取文件的后缀(包含".")
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getExtention(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}
	
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
		}
 
	/**
	 * 将字符串转化为数字，如果遇到非数字则停止转换
	 * @param str
	 * @return
	 */
	public static int val(String str) {
	    StringBuilder validStr = new StringBuilder();
	    boolean seenDot = false;   // when this is true, dots are not allowed
	    boolean seenDigit = false; // when this is true, signs are not allowed
	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        if (c == '.' && !seenDot) {
	            seenDot = true;
	            validStr.append(c);
	        } else if ((c == '-' || c == '+') && !seenDigit) {
	            validStr.append(c);
	        } else if (Character.isDigit(c)) {
	            seenDigit = true;
	            validStr.append(c);
	        } else if (Character.isWhitespace(c)) {
	            // just skip over whitespace
	            continue;
	        } else {
	            // invalid character
	            break;
	        }
	    }
	    String _validStr=validStr.toString();
	    if(null==_validStr|| _validStr.equals("")){
	    	return Integer.parseInt(_validStr);
	    }else{
	    	return 0;
	    }
	}
	
	/**
	 * 判断一个字符串包含几个其他字符串
	 */
	public static int count(String text,String sub){  
        int count =0, start =0;  
        while((start=text.indexOf(sub,start))>=0){  
            start += sub.length();  
            count ++;  
        }  
        return count;  
    } 
	/**
	'------------------------------------------------------------------
	'    名称：   得到档案类型串

	'    功能：   根据ImgFile表的AchvsMainType字段得到档案主类型串

	'    参数：   MainType：AchvsMainType字段值

	'    返回值： 档案主类型串
	'------------------------------------------------------------------
	*/
//	public static String GetDALXID(String MainType){
//	    String strReturn = "";
//	    String strTypeIDs = MainType.trim();
//	    for(int i = 1;i<strTypeIDs.length();i++){
//	    	if(strTypeIDs.substring(i, i+1).equals("1")){
//	    		if(strReturn.equals("")){
//	    			strReturn = ";";
//	    		}
//	    		strReturn = strReturn + i + ";";
//	    	}
//	    }
//	    return strReturn;
//	}
	
	//验证字符串是否为日期格式
//	public static boolean isValidDate(String str) {
//		boolean convertSuccess=true;
//		// 指定日期格式为四位年-两位月份-两位日期，注意yyyy-MM-dd区分大小写；
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期
//			format.setLenient(false);
//			format.parse(str);
//		} catch (ParseException e) {
//			// e.printStackTrace();
//			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
//			convertSuccess=false;
//		} 
//		return convertSuccess;
//	}
}