package com.beer.dao.member;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.jdbc.OracleTypes;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.beer.db.SQL;
import com.beer.vo.grade.GradeVo;
import com.beer.vo.member.MemberVo;

public class MemberDaoImpl extends JdbcDaoSupport implements MemberDao, SQL {

	@Override
	public void memberAll() {
		getJdbcTemplate().query(MEMBER_ALL, new MemberRowMapper<Object>());
	}

	public class MemberRowMapper<T> implements RowMapper<T> {
		@Override
		public T mapRow(ResultSet rs, int rowNum) throws SQLException {
			String m_no = rs.getString("m_no");
			String id = rs.getString("id");
			String password = rs.getString("password");
			String name = rs.getString("name");
			String birth = rs.getString("birth");
			String tel = rs.getString("tel");
			String addr = rs.getString("addr");
			String email = rs.getString("email");
			String job = rs.getString("job");
			int point = rs.getInt("point");
			System.out.printf("%s  %s  %s  %s  %s  %s  %s  %s  %s  %d\n", m_no, id, password, name, birth, tel, addr,
					email, job, point);
			return null;
		}
	}

	@Override
	public int memberDelete(String m_no) {
		int res = getJdbcTemplate().update(MEMBER_DELETE, new Object[] { m_no });
		return res;
	}

	@Override
	public int memberUpdate(String tel, String addr, String email, String job, String m_no) {
		int res = getJdbcTemplate().update(MEMBER_UPDATE, new Object[] { tel, addr, email, job, m_no });
		return res;
	}

	@Override
	public int memberPWchange(String password, String m_no) {
		int res = getJdbcTemplate().update(MEMBER_PW_CHANGE, new Object[] { password, m_no });
		return res;
	}

	@Override
	public int memberInsert(String m_no, String id, String password, String name, String birth, 
			String tel, String addr, String email, String job) {
		int res = getJdbcTemplate().update(MEMBER_INSERT, new Object[] { m_no, id, password, name, birth, tel, addr, email, job });
		return res;
	}

	
//	@Override
//	public Map<String, Object> execmemberFilter(String m_no, String id, String name, String birthlow, String birthhigh,
//			String joinlow, String joinhigh, String addr, String job, String gname) {

//		SimpleJdbcCall sc = new SimpleJdbcCall(getJdbcTemplate()).withProcedureName(MEMBER_FILTER);
//
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("F_M_NO", m_no);
//		map.put("F_ID", id);
//		map.put("f_username", name);
//		map.put("f_birthlow", birthlow);
//		map.put("f_birthhigh", birthhigh);
//		map.put("f_joinlow", joinlow);
//		map.put("f_joinhigh", joinhigh);
//		map.put("f_addr", addr);
//		map.put("f_job", job);
//		map.put("f_gname", gname);
//		SqlParameterSource in = new MapSqlParameterSource(map);
//
//		Map<String, Object> simpleJdbcCallResult = sc.execute(in);
////		System.out.println(simpleJdbcCallResult);
//		return simpleJdbcCallResult;
//	}


	@Override
	public List<MemberVo> execmemberFilter(String m_no, String id, String name, String birthlow, String birthhigh,
			String joinlow, String joinhigh, String addr, String job, String gname) {

		CallableStatementCallback<List<MemberVo>> cb = new CallableStatementCallback<List<MemberVo>>() {
			@Override
			public List<MemberVo> doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
				cs.setString(1, m_no);
				cs.setString(2, id);
				cs.setString(3, name);
				cs.setString(4, birthlow);
				cs.setString(5, birthhigh);
				cs.setString(6, joinlow);
				cs.setString(7, joinhigh);
				cs.setString(8, addr);
				cs.setString(9, job);
				cs.setString(10, gname);
				cs.registerOutParameter(11, OracleTypes.CURSOR);
				cs.execute();
				ResultSet rs = (ResultSet) cs.getObject(11);

				List<MemberVo> mv = new ArrayList<MemberVo>();
				MemberRowMapper2 mapper = new MemberRowMapper2();
				for (int i = 0; rs.next(); i++) {
					mv.add((MemberVo) mapper.mapRow(rs, i));
				}
				return mv;
			}
		};
		return getJdbcTemplate().execute(MEMBER_FILTER, cb);
	}
	
	public class MemberRowMapper2 implements RowMapper<MemberVo> {
		@Override
		public MemberVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberVo mv = new MemberVo();
//			GradeVo gv = new GradeVo();
			mv.setName(rs.getString("name"));
//			gv.setGname(rs.getString("gname"));
			
			System.out.printf("%s\n", rs.getString("name"));
//			System.out.printf("%s %s\n", rs.getString("name"), rs.getString("gname"));
			return null;
		}
	}


}
