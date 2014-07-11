package com.demo.springaopdemo.core;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springaopdemo.aop.ClassAAOP;
import com.demo.springaopdemo.aop.ClassBAOP;
import com.demo.springaopdemo.aop.PersonBean;

public class AppAOP {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "Spring-AOP.xml");
        PersonBean personBean = new PersonBean("Jose Rizal", "Male");

        applicationContext.getBean(ClassAAOP.class).method1();
        applicationContext.getBean(ClassAAOP.class).method2(personBean);
        
        Logger.getLogger(AppAOP.class).info(personBean.toString());
        
        applicationContext.getBean(ClassAAOP.class).getValueA();
        applicationContext.getBean(ClassBAOP.class).getValueB();
        
        applicationContext.getBean(ClassBAOP.class).method1();
        applicationContext.getBean(ClassBAOP.class).method2();
        
        applicationContext.getBean(ClassAAOP.class).throwMeSomeException();
    }
}
