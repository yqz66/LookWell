package cn.bdqn.tangcco.entity;

import java.util.Date;

public class UserHobby {
    private Integer userhobbyId;

    private Integer hobbyId;

    private Integer userinfoId;

    private Date addTime;

    private Date lastUpdate;

    public Integer getUserhobbyId() {
        return userhobbyId;
    }

    public void setUserhobbyId(Integer userhobbyId) {
        this.userhobbyId = userhobbyId;
    }

    public Integer getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(Integer hobbyId) {
        this.hobbyId = hobbyId;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
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