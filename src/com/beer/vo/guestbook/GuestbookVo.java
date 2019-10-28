package com.beer.vo.guestbook;

public class GuestbookVo {

	private String g_no;
	private String s_no;
	private String m_no;
	private String body;

	public GuestbookVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GuestbookVo(String g_no, String s_no, String m_no, String body) {
		super();
		this.g_no = g_no;
		this.s_no = s_no;
		this.m_no = m_no;
		this.body = body;
	}

	public String getG_no() {
		return g_no;
	}

	public void setG_no(String g_no) {
		this.g_no = g_no;
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
