package com.beer.dao.member;

import java.util.List;
import java.util.Map;

import com.beer.vo.member.MemberVo;

public interface MemberDao {
//ggjgjjfjgjfjdf
	public void memberAll();
	public int memberDelete(String m_no);
	public int memberUpdate(String tel, String addr, String email, String job, String m_no);
	public int memberPWchange(String password, String m_no);
	public int memberInsert(String m_no, String id, String password, String name, String birth, 
			String tel, String addr, String email, String job);
	
//	public Map<String, Object> execmemberFilter(String m_no, String id, String name, String birthlow,
//			String birthhigh, String joinlow, String joinhigh, String addr, String job, String gname);
	public List<MemberVo> execmemberFilter(String m_no, String id, String name, String birthlow,
			String birthhigh, String joinlow, String joinhigh, String addr, String job, String gname);
}
