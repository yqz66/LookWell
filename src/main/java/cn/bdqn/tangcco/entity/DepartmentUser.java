package cn.bdqn.tangcco.entity;

import java.util.Date;

public class DepartmentUser {
    private Integer depuseId;

    private String depuseDesc;

    private Integer depId;

    private Integer userId;

    private Date addTime;

    private Date lastUpdate;

    public Integer getDepuseId() {
        return depuseId;
    }

    public void setDepuseId(Integer depuseId) {
        this.depuseId = depuseId;
    }

    public String getDepuseDesc() {
        return depuseDesc;
    }

    public void setDepuseDesc(String depuseDesc) {
        this.depuseDesc = depuseDesc == null ? null : depuseDesc.trim();
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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