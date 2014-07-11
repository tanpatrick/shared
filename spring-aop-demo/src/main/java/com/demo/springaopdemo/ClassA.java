/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.springaopdemo;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.demo.springaopdemo.aop.PersonBean;
import com.demo.springaopdemo.util.LoggerUtil;

/**
 *
 * @author tanpa
 */
@Component
public class ClassA {

    public void method1() {
        LoggerUtil.logMessage("invoked method1 ...");
    }

    public void method2(PersonBean personBean) {
        LoggerUtil.logMessage("invoked method2 ...");
       
        personBean.setCreatedBy("createdBy");
        personBean.setCreatedDate(new Date());        
    }
}
