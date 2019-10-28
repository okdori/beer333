package com.beer.vo.storage;

public class StorageVo {

	private String s_no;
	private String m_no;
	private String photo;

	public StorageVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StorageVo(String s_no, String m_no, String photo) {
		super();
		this.s_no = s_no;
		this.m_no = m_no;
		this.photo = photo;
	}

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}

	public String getM_no() {
		return m_no;
	}

	public void setM_no(String m_no) {
		this.m_no = m_no;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
