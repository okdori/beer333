package com.beer.vo.brand;

public class BrandVo {

	private String br_name;
	private String country;

	public BrandVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BrandVo(String br_name, String country) {
		super();
		this.br_name = br_name;
		this.country = country;
	}

	public String getBr_name() {
		return br_name;
	}

	public void setBr_name(String br_name) {
		this.br_name = br_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
