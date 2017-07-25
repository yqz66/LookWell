package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Informations {
    private Integer informationsId;

    private Integer userinfoId;

    private Integer directionaryId;

    private Date addTime;

    private Date lastupdateTime;

    public Integer getInformationsId() {
        return informationsId;
    }

    public void setInformationsId(Integer informationsId) {
        this.informationsId = informationsId;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Integer getDirectionaryId() {
        return directionaryId;
    }

    public void setDirectionaryId(Integer directionaryId) {
        this.directionaryId = directionaryId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(Date lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }
}