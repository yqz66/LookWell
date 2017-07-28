package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Tbuser {
    private Integer userId;

    private Integer userinfoId;

    private String userName;

    private String password;

    private Date lastLogin;

    @Override
    public String toString() {
        return "Tbuser{" +
                "userId=" + userId +
                ", userinfoId=" + userinfoId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", lastLogin=" + lastLogin +
                '}';
    }

    public Tbuser(Integer userId, Integer userinfoId, String userName, String password, Date lastLogin) {
        this.userId = userId;
        this.userinfoId = userinfoId;
        this.userName = userName;
        this.password = password;
        this.lastLogin = lastLogin;
    }

    public Tbuser() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}