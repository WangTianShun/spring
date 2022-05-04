package com.wts.spring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description: UserService
 * @Author: WangTianShun
 * @Date: 2022/4/9 22:50
 * @Version 1.0
 */
@Component
public class UserService implements InitializingBean {
	@Autowired
	private OrderService orderService;

	@Autowired
	private User admin;

	@Override
	public void afterPropertiesSet() throws Exception {
		// mysql--->User对象--->this.admin
	}

//	@PostConstruct
//	public void a(){
//		// mysql--->User对象--->this.admin
//	}

	public void test(){
		System.out.println("test");
	}


}
