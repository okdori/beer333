package com.beer.vo.beer;

public class BeerVo {

	private String b_no;
	private String bname;
	private int avu;
	private String type;
	private int srm;
	private int ibu;
	private String aroma;
	private String photo;
	private String br_name;

	public BeerVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeerVo(String b_no, String bname, int avu, String type, int srm, int ibu, String aroma, String photo,
			String br_name) {
		super();
		this.b_no = b_no;
		this.bname = bname;
		this.avu = avu;
		this.type = type;
		this.srm = srm;
		this.ibu = ibu;
		this.aroma = aroma;
		this.photo = photo;
		this.br_name = br_name;
	}

	public String getB_no() {
		return b_no;
	}

	public void setB_no(String b_no) {
		this.b_no = b_no;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getAvu() {
		return avu;
	}

	public void setAvu(int avu) {
		this.avu = avu;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSrm() {
		return srm;
	}

	public void setSrm(int srm) {
		this.srm = srm;
	}

	public int getIbu() {
		return ibu;
	}

	public void setIbu(int ibu) {
		this.ibu = ibu;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBr_name() {
		return br_name;
	}

	public void setBr_name(String br_name) {
		this.br_name = br_name;
	}

}
