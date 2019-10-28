package com.beer.vo.review;

public class ReviewVo {

	private String r_no;
	private String m_no;
	private String b_no;
	private String review;

	public ReviewVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewVo(String r_no, String m_no, String b_no, String review) {
		super();
		this.r_no = r_no;
		this.m_no = m_no;
		this.b_no = b_no;
		this.review = review;
	}

	public String getR_no() {
		return r_no;
	}

	public void setR_no(String r_no) {
		this.r_no = r_no;
	}

	public String getM_no() {
		return m_no;
	}

	public void setM_no(String m_no) {
		this.m_no = m_no;
	}

	public String getB_no() {
		return b_no;
	}

	public void setB_no(String b_no) {
		this.b_no = b_no;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
