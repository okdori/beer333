package com.beer.vo.member;

import java.util.Date;

public class MemberVo {

	private String m_no;
	private String id;
	private String password;
	private String name;
	private String birth;
	private String tel;
	private String addr;
	private String email;
	private String job;
	private int point;

	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberVo(String m_no, String id, String password, String name, String birth, String tel, String addr,
			String email, String job, int point) {
		super();
		this.m_no = m_no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.tel = tel;
		this.addr = addr;
		this.email = email;
		this.job = job;
		this.point = point;
	}

	public String getM_no() {
		return m_no;
	}

	public void setM_no(String m_no) {
		this.m_no = m_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
