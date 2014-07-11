/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.springaopdemo.core;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springaopdemo.ClassA;
import com.demo.springaopdemo.ClassB;
import com.demo.springaopdemo.aop.PersonBean;

/**
 *
 * @author tanpa
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-AOP.xml");
        PersonBean personBean = new PersonBean("Jose Rizal", "Male");

        applicationContext.getBean(ClassA.class).method1();
        applicationContext.getBean(ClassA.class).method2(personBean);

        Logger.getLogger(AppAOP.class).info(personBean.toString());

        applicationContext.getBean(ClassB.class).method1();
        applicationContext.getBean(ClassB.class).method2();
        applicationContext.getBean(ClassB.class).method3();

    }
}
