package com.beer.dao.review;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.beer.db.SQL;
import com.beer.vo.review.ReviewVo;

import oracle.jdbc.OracleTypes;

public class ReviewDaoImpl extends JdbcDaoSupport implements ReviewDao, SQL {

	@Override
	public List<ReviewVo> execreviewSearch(String b_no_or_m_no) {
		
		CallableStatementCallback<List<ReviewVo>> cb = new CallableStatementCallback<List<ReviewVo>>() {
			@Override
			public List<ReviewVo> doInCallableStatement(CallableStatement cs)
					throws SQLException, DataAccessException {
				cs.setString(1, b_no_or_m_no);
				cs.registerOutParameter(2, OracleTypes.CURSOR);
				cs.execute();
				ResultSet rs = (ResultSet) cs.getObject(2);

				List<ReviewVo> gv = new ArrayList<ReviewVo>();
				ReviewRowMapper mapper = new ReviewRowMapper();
				for (int i = 0; rs.next(); i++) {
					gv.add((ReviewVo) mapper.mapRow(rs, i));
				}
				return gv;
			}
		};
		return getJdbcTemplate().execute(REVIEW_SEARCH, cb);
	}

	public class ReviewRowMapper implements RowMapper<ReviewVo> {
		@Override
		public ReviewVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			ReviewVo rv = new ReviewVo();
			rv.setReview(rs.getString(1));
			
			System.out.printf("%s\n", rs.getString(1));
			return null;
		}

	}
}
