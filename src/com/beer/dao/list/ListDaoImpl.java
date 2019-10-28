package com.beer.dao.list;

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
import com.beer.vo.beer.BeerVo;
import com.beer.vo.list.ListVo;

import oracle.jdbc.OracleTypes;

public class ListDaoImpl extends JdbcDaoSupport implements ListDao, SQL  {

	@Override
	public int deleteList(String l_category, String s_no, String b_no) {
		int res = getJdbcTemplate().update(LIST_DELETE, new Object[] {l_category, s_no, b_no});
		return res;
	}

	@Override
	public int insertList(String l_category, String s_no, String b_no) {
		int res = getJdbcTemplate().update(LIST_INSERT, new Object[] {l_category, s_no, b_no});
		return res;
	}

	@Override
	public List<ListVo> execbeerList(String l_category, String m_no) {
		
		CallableStatementCallback<List<ListVo>> cb = new CallableStatementCallback<List<ListVo>>() {
			@Override
			public List<ListVo> doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
				cs.setString(1, l_category);
				cs.setString(2, m_no);
				cs.registerOutParameter(3, OracleTypes.CURSOR);
				cs.execute();
				ResultSet rs = (ResultSet) cs.getObject(3);

				List<ListVo> lv = new ArrayList<ListVo>();
				ListRowMapper mapper = new ListRowMapper();
				for (int i = 0; rs.next(); i++) {
					lv.add((ListVo) mapper.mapRow(rs, i));
				}
				return lv;
			}
		};
		return getJdbcTemplate().execute(LIST_FILTER, cb);
	}
	
	public class ListRowMapper implements RowMapper<ListVo> {
		@Override
		public ListVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			BeerVo bv = new BeerVo();
			bv.setPhoto(rs.getString("photo"));
			
			System.out.printf("%s\n", rs.getString("photo"));
			return null;
		}
	}

}
