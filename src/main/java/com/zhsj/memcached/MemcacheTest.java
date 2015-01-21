package com.zhsj.memcached;

import net.spy.memcached.MemcachedClient;

import org.junit.Test;

import com.zhsj.memcached.model.User;

public class MemcacheTest extends AbstractTransactionalTests {

	private MemcachedClient memcachedClient;
	
	private int keepSecond = 60*60;

	private void init() {
		this.memcachedClient = (MemcachedClient) getContext().getBean(
				"memcachedClient");
	}

	public void testAdd() {
		init();
		System.out.println(memcachedClient.set("memcached", keepSecond, "memcachedtest"));
	}

	public void testAddUser() {
		init();
		User user = new User();
		user.setUserName("memcached");
		System.out.println(memcachedClient.set("user", keepSecond, user));
	}
	
	@Test
	public void testName() throws Exception {
		testAdd();
	}

}
