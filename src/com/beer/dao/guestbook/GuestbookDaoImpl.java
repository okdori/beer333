package com.beer.dao.guestbook;

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
import com.beer.vo.guestbook.GuestbookVo;
import com.beer.vo.member.MemberVo;

import oracle.jdbc.OracleTypes;

public class GuestbookDaoImpl extends JdbcDaoSupport implements GuestbookDao, SQL {

	@Override
	public List<GuestbookVo> execguestbookList(String m_no) {

		CallableStatementCallback<List<GuestbookVo>> cb = new CallableStatementCallback<List<GuestbookVo>>() {
			@Override
			public List<GuestbookVo> doInCallableStatement(CallableStatement cs)
					throws SQLException, DataAccessException {
				cs.setString(1, m_no);
				cs.registerOutParameter(2, OracleTypes.CURSOR);
				cs.execute();
				ResultSet rs = (ResultSet) cs.getObject(2);

				List<GuestbookVo> gv = new ArrayList<GuestbookVo>();
				GuestbookRowMapper mapper = new GuestbookRowMapper();
				for (int i = 0; rs.next(); i++) {
					gv.add((GuestbookVo) mapper.mapRow(rs, i));
				}
				return gv;
			}
		};
		return getJdbcTemplate().execute(GUESTBOOK_ALL, cb);
	}

	public class GuestbookRowMapper implements RowMapper<GuestbookVo> {
		@Override
		public GuestbookVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberVo mv = new MemberVo();
			GuestbookVo gv = new GuestbookVo();
			mv.setName(rs.getString(1));
			gv.setBody(rs.getString("body"));

			System.out.printf("%s %s\n", rs.getString(1), rs.getString("body"));
			return null;
		}

	}
}
