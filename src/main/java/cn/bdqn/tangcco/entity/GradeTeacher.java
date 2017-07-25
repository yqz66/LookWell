package cn.bdqn.tangcco.entity;

import java.util.Date;

public class GradeTeacher {
    private Integer grateaId;

    private Integer teacherId;

    private Integer gradeId;

    private Integer grateaDesc;

    private Date addTime;

    private Date lastUpdate;

    public Integer getGrateaId() {
        return grateaId;
    }

    public void setGrateaId(Integer grateaId) {
        this.grateaId = grateaId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getGrateaDesc() {
        return grateaDesc;
    }

    public void setGrateaDesc(Integer grateaDesc) {
        this.grateaDesc = grateaDesc;
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