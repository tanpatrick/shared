/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.springaopdemo;

import com.demo.springaopdemo.util.LoggerUtil;
import org.springframework.stereotype.Component;

/**
 *
 * @author tanpa
 */
@Component
public class ClassB {

    public void method1() {
        LoggerUtil.logMessage("invoked method1 ...");
    }

    public void method2() {
        LoggerUtil.logMessage("invoked method2 ...");
    }

    public void method3() {
        LoggerUtil.logMessage("invoked method3 ...");
    }
}
