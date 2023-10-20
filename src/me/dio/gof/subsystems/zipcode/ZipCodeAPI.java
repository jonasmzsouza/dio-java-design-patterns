package me.dio.gof.subsystems.zipcode;

public class ZipCodeAPI {

	private static ZipCodeAPI instance = new ZipCodeAPI();

	private ZipCodeAPI() {
		super();
	}

	public static ZipCodeAPI getInstance() {
		return instance;
	}

	public String getCity(String zipCode) {
		return "Itapevi";
	}

	public String getState(String zipCode) {
		return "São Paulo";
	}

}
