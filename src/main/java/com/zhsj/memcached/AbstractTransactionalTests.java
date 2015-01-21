package com.zhsj.memcached;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractTransactionalTests extends TestCase {
	private ApplicationContext context;

	@Override
	protected void setUp() throws Exception {
		String[] config = {"spring.xml"};
		this.context = new ClassPathXmlApplicationContext(config);
		super.setUp();
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}
}
