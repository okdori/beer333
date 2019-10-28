package com.beer.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beer.dao.beer.BeerDao;
import com.beer.vo.beer.BeerVo;

public class BeerTest {
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

//	MemberDao memberdao = factory.getBean("member", MemberDao.class);
		BeerDao beerdao = factory.getBean("beer", BeerDao.class);

//	beerdao.beerDelete("b0019");
//	beerdao.beerUpdate("기네스2", 12, "ALE", 43, 11, "달달합니다", "맥주사진경로", "하이트진로", "b0022");
//	

//	BeerVo vo  = new BeerVo();
//	vo.setBname("기네스4");
//	vo.setAvu(11);
//	vo.setType("ALE");
//	vo.setIbu(20);
//	vo.setSrm(20);
//	vo.setAroma("달달");
//	vo.setPhoto("사진");
//	vo.setBr_name("하이트진로");
//	beerdao.beerInsert("기네스5", 12, "ALE", 43, 11, "달달합니다", "맥주사진경로", "하이트진로");
		List<BeerVo> res = beerdao.execbeerFilter("", "", 0, 100, "");

		((ClassPathXmlApplicationContext) factory).close();
	}
}
