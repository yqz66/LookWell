package cn.bdqn.tangcco.entity;

import java.util.Date;

public class TimeTable {
    private Integer timtabId;

    private Date timtabDate;

    private Integer timtabPeriod;

    private Integer roomId;

    private Integer gradeId;

    private Integer chapterId;

    private Integer teacherId;

    private Date startTime;

    private Date endTime;

    private Date addTime;

    private Date lastUpdate;

    public Integer getTimtabId() {
        return timtabId;
    }

    public void setTimtabId(Integer timtabId) {
        this.timtabId = timtabId;
    }

    public Date getTimtabDate() {
        return timtabDate;
    }

    public void setTimtabDate(Date timtabDate) {
        this.timtabDate = timtabDate;
    }

    public Integer getTimtabPeriod() {
        return timtabPeriod;
    }

    public void setTimtabPeriod(Integer timtabPeriod) {
        this.timtabPeriod = timtabPeriod;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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