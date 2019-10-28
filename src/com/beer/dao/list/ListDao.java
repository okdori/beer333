package com.beer.dao.list;

import java.util.List;

import com.beer.vo.list.ListVo;

public interface ListDao {
	
	public int deleteList(String l_category, String s_no, String b_no);
	public int insertList(String l_category, String s_no, String b_no);
	
	public List<ListVo> execbeerList(String l_category, String m_no);
}
