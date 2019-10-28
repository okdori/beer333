package com.beer.dao.guestbook;

import java.util.List;

import com.beer.vo.guestbook.GuestbookVo;

public interface GuestbookDao {

	public List<GuestbookVo> execguestbookList(String m_no);
}
