package com.my.test;



import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class Main {
	
	public static void main(String[] args) {
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();  
		Client client =
			dcf.createClient(
				""
			);
        Object[] objects;  
        try {  
            objects = client.invoke("","","");
            //杈撳嚭璋冪敤缁撴灉  
            System.out.println(objects[0].toString());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }
	}

}
