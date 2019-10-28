package com.beer.vo.qna;

public class QnaVo {

	private String q_no;
	private String s_no;
	private String yesno;
	private String question;
	private String answer;

	public QnaVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QnaVo(String q_no, String s_no, String yesno, String question, String answer) {
		super();
		this.q_no = q_no;
		this.s_no = s_no;
		this.yesno = yesno;
		this.question = question;
		this.answer = answer;
	}

	public String getQ_no() {
		return q_no;
	}

	public void setQ_no(String q_no) {
		this.q_no = q_no;
	}

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}

	public String getYesno() {
		return yesno;
	}

	public void setYesno(String yesno) {
		this.yesno = yesno;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
