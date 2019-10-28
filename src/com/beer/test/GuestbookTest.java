package com.beer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beer.dao.guestbook.GuestbookDao;

public class GuestbookTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GuestbookDao guestbook = factory.getBean("guestbook", GuestbookDao.class);
		
		guestbook.execguestbookList("f191104004");
		
		((ClassPathXmlApplicationContext) factory).close();
	}
}
