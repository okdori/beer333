package com.beer.dao.review;

import java.util.List;

import com.beer.vo.review.ReviewVo;

public interface ReviewDao {

	public List<ReviewVo> execreviewSearch(String b_no_or_m_no);
}
