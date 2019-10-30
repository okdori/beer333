package com.beer.dao.beer;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD


=======
>>>>>>> branch 'master' of https://github.com/m1ngoDo/beer333
import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.beer.db.SQL;
import com.beer.vo.beer.BeerVo;

import oracle.jdbc.OracleTypes;



public class BeerDaoImpl extends JdbcDaoSupport implements BeerDao, SQL {

	@Override
	public int beerDelete(String b_no) {
		// TODO Auto-generated method stub

		int res = getJdbcTemplate().update(BEER_DELETE, new Object[] { b_no });

		return res;
	}

	@Override
	public int beerUpdate(String bname, int avu, String type, int srm, int ibu, String aroma, String photo,
			String br_name, String b_no) {
		// TODO Auto-generated method stub
		int res = getJdbcTemplate().update(BEER_UPDATE,
				new Object[] { bname, avu, type, srm, ibu, aroma, photo, br_name, b_no });
		return res;
	}

//	@Override
//	public void beerInsert(BeerVo vo) {
	// TODO Auto-generated method stub
//		getJdbcTemplate().update(BEER_INSERT, vo.getBname(), vo.getAvu(), vo.getType(), vo.getSrm(), vo.getIbu(),
//				vo.getAroma(), vo.getPhoto(), vo.getBr_name());

//		int res = getJdbcTemplate().update(BEER_INSERT,  new Object[] {bname,avu,type,srm,ibu,aroma,photo,br_name});
//		return res;
//		session.insert(BEER_INSERT, new Object[] {bname,avu,type,srm,ibu,aroma,photo,br_name});
//	}
	@Override
	public int beerInsert(String bname, int avu, String type, int srm, int ibu, String aroma, String photo,
			String br_name) {
		int res = getJdbcTemplate().update(BEER_INSERT,
				new Object[] { bname, avu, type, srm, ibu, aroma, photo, br_name });
		return res;
//		session.insert(BEER_INSERT, new Object[] {bname,avu,type,srm,ibu,aroma,photo,br_name});
	}

	@Override
	public List<BeerVo> execbeerFilter(String b_no, String type, double lowavu, double highavu, String country) {

		CallableStatementCallback<List<BeerVo>> cb = new CallableStatementCallback<List<BeerVo>>() {
			@Override
			public List<BeerVo> doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
				cs.setString(1, b_no);
				cs.setString(2, type);
				cs.setDouble(3, lowavu);
				cs.setDouble(4, highavu);
				cs.setString(5, country);
				cs.registerOutParameter(6, OracleTypes.CURSOR);
				cs.execute();
				ResultSet rs = (ResultSet) cs.getObject(6);

				List<BeerVo> mv = new ArrayList<BeerVo>();
				BeerRowMapper2 mapper = new BeerRowMapper2();
				for (int i = 0; rs.next(); i++) {
					mv.add((BeerVo) mapper.mapRow(rs, i));
				}
				return mv;
			}
		};
		return getJdbcTemplate().execute(BEER_FILTER, cb);
	}

	public class BeerRowMapper2 implements RowMapper<BeerVo> {
		@Override
		public BeerVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			BeerVo bv = new BeerVo();
//			BrandVo rv = new BrandVo();
			bv.setB_no(rs.getString("b_no"));
//			rv.setBr_name(rs.getString("br_name"));
			System.out.printf("%s\n",rs.getString("b_no"));

//			System.out.printf("%s %s\n", rs.getString("br_name"), rs.getString("br_name"));
			return null;
		}
	}

}
