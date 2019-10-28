package com.beer.dao.beer;

import java.util.List;

import com.beer.vo.beer.*;


public interface BeerDao {

	public int beerDelete(String b_no);

	public int beerUpdate(String bname, int avu, String type, int srm, int ibu, String aroma, String photo,
			String br_name, String b_no);

	public int beerInsert(String bname, int avu, String type, int srm, int ibu, String aroma, String photo,
			String br_name);

//	public void beerInsert(BeerVo vo);

//	public List<MemberVo> execmemberFilter(String m_no, String id, String name, String birthlow, String birthhigh,
//			String joinlow, String joinhigh, String addr, String job, String gname);
//			//br_name ,b_no,b.type,lowavu,highavu,country

	public List<BeerVo> execbeerFilter(String b_no, String type, double lowavu, double highavu, String country);
}
