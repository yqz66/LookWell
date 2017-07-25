package cn.bdqn.tangcco.entity;

import java.util.Date;

public class GradeType {
    private Integer gratypId;

    private String gratypName;

    private Date addTime;

    private Date lastUpdate;

    public Integer getGratypId() {
        return gratypId;
    }

    public void setGratypId(Integer gratypId) {
        this.gratypId = gratypId;
    }

    public String getGratypName() {
        return gratypName;
    }

    public void setGratypName(String gratypName) {
        this.gratypName = gratypName == null ? null : gratypName.trim();
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