package cn.bdqn.tangcco.entity;

import java.util.Date;

public class UserAdr {
    private Integer useradrId;

    private Integer userinfoId;

    private Integer areaid;

    private Date addTime;

    private Date lastUpdate;

    public Integer getUseradrId() {
        return useradrId;
    }

    public void setUseradrId(Integer useradrId) {
        this.useradrId = useradrId;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
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