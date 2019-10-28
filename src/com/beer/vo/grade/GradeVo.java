package com.beer.vo.grade;

public class GradeVo {

	private String gname;
	private int lowpoint;
	private int highpoint;

	public GradeVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradeVo(String gname, int lowpoint, int highpoint) {
		super();
		this.gname = gname;
		this.lowpoint = lowpoint;
		this.highpoint = highpoint;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getLowpoint() {
		return lowpoint;
	}

	public void setLowpoint(int lowpoint) {
		this.lowpoint = lowpoint;
	}

	public int getHighpoint() {
		return highpoint;
	}

	public void setHighpoint(int highpoint) {
		this.highpoint = highpoint;
	}

}
