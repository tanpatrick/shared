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
public class ClassBAOP {

    public void method1() {
        //Do something here ...
    }

    public void method2() {
        //Do something here ...
    }

    public String getValueB() {
        //Do something here ...
        return "getValue [ClassBAOP]";
    }
}
