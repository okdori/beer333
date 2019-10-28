package com.beer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beer.dao.list.ListDao;

public class ListTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		ListDao list = factory.getBean("list", ListDao.class);
//		int count = list.deleteList("추천", "sabcabc123", "b0007");
//		System.out.println(count+"삭제완료");

//		int count2 = list.insertList("추천", "sabcabc123", "b0007");
//		 System.out.println(count2 + "입력완료");
	
		list.execbeerList("추천", "m191027002");
		
		((ClassPathXmlApplicationContext) factory).close();
	}

}
