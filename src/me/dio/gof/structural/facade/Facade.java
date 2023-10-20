package me.dio.gof.structural.facade;

import me.dio.gof.subsystems.crm.CrmService;
import me.dio.gof.subsystems.zipcode.ZipCodeAPI;

public class Facade {

	public void migrateCustomer(String name, String zipCode) {
		String city = ZipCodeAPI.getInstance().getCity(zipCode);
		String state = ZipCodeAPI.getInstance().getState(zipCode);

		CrmService.saveCustomer(name, zipCode, city, state);
	}

}
