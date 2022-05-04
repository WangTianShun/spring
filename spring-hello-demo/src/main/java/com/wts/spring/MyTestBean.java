package com.wts.spring;

import com.wts.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;

/**
 * Bean的创建的生命周期
 * UserService类--->无参构造方法--->普通对象--->依赖注入--->
 * 初始化前(@PostConstruct)--->初始化(InitializingBean)--->初始化后(AOP)--->代理对象--->放入单烈池Map--->Bean
 */
public class MyTestBean {

	private String name = "hello，wts";

	public MyTestBean(String name) {
		this.name = name;
	}

	public MyTestBean() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserService userService = applicationContext.getBean(UserService.class);
//		userService.test();
//		UserService userService1 = new UserService();
//		for (Field filed : userService1.getClass().getFields()){
//			if (filed.isAnnotationPresent(Autowired.class)){
//				filed.set(userService1, ??);
//			}
//		}
//	}
}
