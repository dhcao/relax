package cn.xiawan.pojo.userPojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by key. on 2018/4/9.
 */
public class User implements Serializable{
    private Integer userId;
    private String userName;
    private Integer credits;
    private String password;
    private Date lastVisit;
    private String lastIp;
    private Integer refInfo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Integer getRefInfo() {
        return refInfo;
    }

    public void setRefInfo(Integer refInfo) {
        this.refInfo = refInfo;
    }
}
