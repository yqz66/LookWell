package cn.bdqn.tangcco.entity;

import java.util.Date;

public class GradeType {
    private Integer gratypId;

    private String gratypName;

    private Date addTime;

    private Date lastUpdate;

    public GradeType(Integer gratypId, String gratypName, Date addTime, Date lastUpdate) {
        this.gratypId = gratypId;
        this.gratypName = gratypName;
        this.addTime = addTime;
        this.lastUpdate = lastUpdate;
    }

    @Override

    public String toString() {
        return "GradeType{" +
                "gratypId=" + gratypId +
                ", gratypName='" + gratypName + '\'' +
                ", addTime=" + addTime +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    public GradeType() {
    }

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