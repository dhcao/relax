package cn.xiawan.pojo.userPojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by key. on 2018/4/9.
 */
public class LoginLog implements Serializable{
    private Integer loginLogId;
    private Integer userId;
    private String ip;
    private Date loginDatetime;
    private Date logoutDatetime;

    public Integer getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

    public Date getLogoutDatetime() {
        return logoutDatetime;
    }

    public void setLogoutDatetime(Date logoutDatetime) {
        this.logoutDatetime = logoutDatetime;
    }
}
