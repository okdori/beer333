package com.beer.vo.list;

public class ListVo {

	private String l_category;
	private String s_no;
	private String b_no;

	public ListVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListVo(String l_category, String s_no, String b_no) {
		super();
		this.l_category = l_category;
		this.s_no = s_no;
		this.b_no = b_no;
	}

	public String getL_category() {
		return l_category;
	}

	public void setL_category(String l_category) {
		this.l_category = l_category;
	}

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}

	public String getB_no() {
		return b_no;
	}

	public void setB_no(String b_no) {
		this.b_no = b_no;
	}

}
