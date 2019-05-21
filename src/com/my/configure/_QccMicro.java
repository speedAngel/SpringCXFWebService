
package com.my.configure;

import org.jawin.COMException;
import org.jawin.COMPtr;
import org.jawin.DispatchPtr;
import org.jawin.GUID;
import org.jawin.IdentityManager;

/**
 * V3.0.0 tyb 2014-09-19
 * @author tyb
 *
 */
public class _QccMicro extends DispatchPtr {
	public static final GUID DIID = new GUID("{d2d48d5f-186d-448c-B98E-633E86DC41EE}");
	
	//V3.0.3 2015-11-07 柳笑宇
	//改用CLSID创建对象
	public static final GUID CLSID = new GUID("{8c16cc52-5623-4882-935D-ECC21BCD4F31}");
	//public static final java.lang.String PROGID = "qcclib.QccMicro";
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, _QccMicro.class);
	}

	public _QccMicro() {
		super();
	}

	public _QccMicro(String progid) throws COMException {
		super(progid, DIID);
	}

	public _QccMicro(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	public _QccMicro(COMPtr comObject) throws COMException {
		super(comObject);
	}

	public int getIIDToken() {
		return IID_TOKEN;
	}

	public String getData1(String dType,String data) throws COMException
    {
		return (String)invokeN("getData1", new Object[] {dType, data});
    }
	
	public String getData2(String dType,String data) throws COMException
    {
		return (String)invokeN("getData2", new Object[] {dType, data});
    }
    
    public String GetRetData2() throws COMException
    {
		return (String)invokeN("GetRetData2", new Object[] {});
    }

    public String QualityCheck2Fun(String Data1,String qcType) throws COMException
    {
		return (String)invokeN("QualityCheck2Fun", new Object[] {Data1, qcType});
    }
    
    public String QualityCheckFun(String Data1,String data3,String qcType) throws COMException
    {
		return (String)invokeN("QualityCheckFun", new Object[] {Data1, data3, qcType});
    }
    
    public String getData5(String dType,String data) throws COMException
    {
		return (String)invokeN("getData5", new Object[] {dType, data});
    }

    public String getData6(String dType,String data) throws COMException
    {
		return (String)invokeN("getData6", new Object[] {dType, data});
    }
    
    public static void main(String[] args) {
    	try {
			String achvscontent = "[1]{;1:1;2:5;3:10;7:8;9:9;16:11;14:13}";
			String pageclass1 = "00B0300C0300D0300E0300F030100101103012010130301403015010160301702018030190301A0301B0201C02";
			String imgfile = "2017112403507674663dfjy";
			
		//	_QccMicro myobj=new _QccMicro(_QccMicro.PROGID);
			_QccMicro myobj=new _QccMicro(CLSID);
			
//			achvscontent = myobj.QualityCheckFun(achvscontent, pageclass1,  "u1fRpGmR4l");
//			pageclass1=myobj.GetRetData2();
//			
//			System.out.println(achvscontent);
//			System.out.println(pageclass1);
//			
			imgfile = myobj.QualityCheck2Fun(imgfile, "nT*3h>s5o)L");
			System.out.println(imgfile);
//			
//			String url = "UserAdmCode=110100&UID=dazx&PWD=CFA9FD200AB2B8CFDE1F1253E813FB78A861&QryAdmCode=110100&RegistID=VII000174";
//			url = myobj.getData5("7gK4*J<=s@", url);
//			System.out.println(url);
//			url = myobj.getData6("}9G6d%~?T)", url);
//			System.out.println(url);
			
			
			String pwd = "adm";
			System.out.println(myobj.getData2("g5s}8Db#|xE", pwd).equals("0C722B70722F90D3DE1F1253E813FB78A861"));
			pwd = "adm666";
			System.out.println(myobj.getData2("g5s}8Db#|xE", pwd).equals("04E1B74FFDC10180DE1F1253E813FB78A861"));
		} catch (COMException e) {
			e.printStackTrace();
		}
	}
}