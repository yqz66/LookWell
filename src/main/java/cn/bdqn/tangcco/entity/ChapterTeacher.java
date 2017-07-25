package cn.bdqn.tangcco.entity;

import java.util.Date;

public class ChapterTeacher {
    private Integer chateaId;

    private Integer teacherId;

    private Integer chapterId;

    private Date addTime;

    private Date lastUpdate;

    public Integer getChateaId() {
        return chateaId;
    }

    public void setChateaId(Integer chateaId) {
        this.chateaId = chateaId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
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