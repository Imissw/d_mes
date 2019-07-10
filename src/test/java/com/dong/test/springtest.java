package com.dong.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dong.dao.TestuserMapper;
import com.dong.model.Testuser;

public class springtest {
	
	private static ApplicationContext bean=new ClassPathXmlApplicationContext("spring\\applicationContext.xml");
	private TestuserMapper testuserMapper;
	@Test
	public void testMapper() {
		testuserMapper=bean.getBean(TestuserMapper.class);
		Testuser user=Testuser.builder().name("bean02").build();
		testuserMapper.insertSelective(user);
	}


}
