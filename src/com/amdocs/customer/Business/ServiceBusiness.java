package com.amdocs.customer.Business;

import java.util.List;
import java.util.Vector;

import com.amdocs.customer.bean.Service;

public class ServiceBusiness {
	List listServices = new Vector();

	@SuppressWarnings("unchecked")
	public ServiceBusiness() {
		super();
		for (int i=1; i < 20; i++) {
			this.listServices.add(new Service(System.currentTimeMillis(), i, "service" + i, false, false));
		}
	}
	
	

}
