package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Roleuser {
    private Integer roluseId;

    private Integer userId;

    private Integer roleId;

    private String roluseDesc;

    private Date addTime;

    private Date lastUpdate;

    public Integer getRoluseId() {
        return roluseId;
    }

    public void setRoluseId(Integer roluseId) {
        this.roluseId = roluseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoluseDesc() {
        return roluseDesc;
    }

    public void setRoluseDesc(String roluseDesc) {
        this.roluseDesc = roluseDesc == null ? null : roluseDesc.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}