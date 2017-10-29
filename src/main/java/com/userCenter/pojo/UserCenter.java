package com.userCenter.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Title:
 * Description:
 * Project: userCenter
 * Create Time:2017/10/29 15:56
 */
public class UserCenter implements Serializable {

    private Integer id;
    private String jibie;
    private String name;
    private String sex;
    private Date birthday;
    private String zhiwu;
    private String dad;
    private String mom;
    private String son;
    private String daughter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJibie() {
        return jibie;
    }

    public void setJibie(String jibie) {
        this.jibie = jibie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }

    public String getDad() {
        return dad;
    }

    public void setDad(String dad) {
        this.dad = dad;
    }

    public String getMom() {
        return mom;
    }

    public void setMom(String mom) {
        this.mom = mom;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public String getDaughter() {
        return daughter;
    }

    public void setDaughter(String daughter) {
        this.daughter = daughter;
    }
}
