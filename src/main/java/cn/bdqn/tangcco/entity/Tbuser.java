package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Tbuser {
    private Integer userId;

    private Integer userinfoId;

    private String userName;

    private String password;

    private Date lastLogin;

    private UserInfo uInfo;

    public Tbuser() {
    }

    @Override
    public String toString() {
        return "Tbuser{" +
                "userId=" + userId +
                ", userinfoId=" + userinfoId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", lastLogin=" + lastLogin +
                ", uInfo=" + uInfo +
                '}';
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
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public UserInfo getuInfo() {
        return uInfo;
    }

    public void setuInfo(UserInfo uInfo) {
        this.uInfo = uInfo;
    }

    public Tbuser(Integer userId, Integer userinfoId, String userName, String password, Date lastLogin, UserInfo uInfo) {
        this.userId = userId;
        this.userinfoId = userinfoId;
        this.userName = userName;
        this.password = password;
        this.lastLogin = lastLogin;
        this.uInfo = uInfo;
    }
}