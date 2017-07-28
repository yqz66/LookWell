package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Roleuser {
    private Integer roluseId;

    private Tbuser tbuser;

    private Role role;

    private String roluseDesc;

    private Date addTime;

    private Date lastUpdate;

    @Override
    public String toString() {
        return "Roleuser{" +
                "roluseId=" + roluseId +
                ", tbuser=" + tbuser +
                ", role=" + role +
                ", roluseDesc='" + roluseDesc + '\'' +
                ", addTime=" + addTime +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    public Integer getRoluseId() {
        return roluseId;
    }

    public void setRoluseId(Integer roluseId) {
        this.roluseId = roluseId;
    }

    public Tbuser getTbuser() {
        return tbuser;
    }

    public void setTbuser(Tbuser tbuser) {
        this.tbuser = tbuser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getRoluseDesc() {
        return roluseDesc;
    }

    public void setRoluseDesc(String roluseDesc) {
        this.roluseDesc = roluseDesc;
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

    public Roleuser(Integer roluseId, Tbuser tbuser, Role role, String roluseDesc, Date addTime, Date lastUpdate) {
        this.roluseId = roluseId;
        this.tbuser = tbuser;
        this.role = role;
        this.roluseDesc = roluseDesc;
        this.addTime = addTime;
        this.lastUpdate = lastUpdate;
    }

    public Roleuser() {
    }
}