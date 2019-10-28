package com.beer.dao.storage;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.beer.db.SQL;

public class StorageDaoImpl extends JdbcDaoSupport implements StorageDao, SQL {

	@Override
	public int memberPhotoUpdate(String photo, String s_no) {
		int res = getJdbcTemplate().update(MEMBER_PHOTO_UPDATE, new Object[] { photo, s_no });
		return res;
	}

}
