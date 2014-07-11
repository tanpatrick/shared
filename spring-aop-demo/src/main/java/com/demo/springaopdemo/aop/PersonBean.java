/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.springaopdemo.aop;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanpa
 */
public class PersonBean {

    private String name;
    private String gender;
    private String createdBy;
    private Date createdDate;

    public PersonBean(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return (Date) (createdDate == null ? null : createdDate.clone());
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = (Date) (createdDate == null ? null : createdDate.clone());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Field field : this.getClass().getDeclaredFields()) {
            try {
                sb.append("Field [").append(field.getName()).append(" - ");
                sb.append(this.getClass().getDeclaredField(field.getName()).get(this)).append("]");
                sb.append(System.getProperty("line.separator"));
            } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(PersonBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return sb.toString();
    }

}
