package com.beer.db;

public interface SQL {

	// Member
	static final String MEMBER_ALL = "select * from member";
	static final String MEMBER_DELETE = "delete from member where m_no = ?";
	static final String MEMBER_UPDATE = "update member set tel = ?, addr = ?, email = ?, job = ? where m_no = ?";
	static final String MEMBER_PW_CHANGE = "update member set password = ? where m_no = ?";
	static final String MEMBER_INSERT = "insert into member(m_no, id, password, name, birth, tel, addr, email, job)"
			+ "values(?, ?, ?, ?, to_date(?, 'yyyy-mm-dd'), ?, ?, ?, ?)";
	//	static final String MEMBER_FILTER = "memberfilter";
	static final String MEMBER_FILTER = "{call memberfilter(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
	
	
	// List
	static final String LIST_DELETE = "delete from List where l_category = ? and s_no = ? and b_no = ?";  
	static final String LIST_INSERT = "insert into List values(?, ?, ?)";
	static final String LIST_FILTER = "{call beerlist(?, ?, ?)}";

	
	// Storage
	static final String MEMBER_PHOTO_UPDATE = "update storage set photo = nvl(?, '기본사진경로') where s_no = ?";
	
	
	// Guestbook
	static final String GUESTBOOK_ALL = "{call guestbooklist(?, ?)}";
	
	
	// Review
	static final String REVIEW_SEARCH = "{call reviewsearch(?, ?)}";
}
