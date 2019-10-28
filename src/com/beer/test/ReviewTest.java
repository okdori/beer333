package com.beer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beer.dao.review.ReviewDao;

public class ReviewTest {

public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ReviewDao review = factory.getBean("review", ReviewDao.class);
		
		review.execreviewSearch("b0002");
		
		((ClassPathXmlApplicationContext) factory).close();
	}
}
