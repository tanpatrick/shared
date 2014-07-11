/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.springaopdemo.util;

import org.apache.log4j.Logger;

/**
 *
 * @author tanpa
 */
public class LoggerUtil {

    private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class);

    public static void logMessage(String message) {
        LOGGER.info(message);
    }
}
