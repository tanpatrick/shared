/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.springaopdemo.aop;

import org.springframework.stereotype.Component;

/**
 *
 * @author tanpa
 */
@Component
public class ClassAAOP {

    public void method1() {
        //Do something here ...
        getValueA();

    }

    public void method2(PersonBean personBean) {
        //Do something here ...        
    }

    public String getValueA() {
        return "getValue [ClassAAOP]";
    }

    public void throwMeSomeException() {
        Integer.parseInt("2.1");
    }
}
