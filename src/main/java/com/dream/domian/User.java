package com.dream.domian;

import java.util.Date;

/**
 * Description:
 * User: caoxiaolin
 * Date: 2018-03-16
 * Time: 16:34
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
