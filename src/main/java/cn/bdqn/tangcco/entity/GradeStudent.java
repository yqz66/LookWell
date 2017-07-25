package cn.bdqn.tangcco.entity;

import java.util.Date;

public class GradeStudent {
    private Integer grastuId;

    private String grastuDesc;

    private Integer studentId;

    private Integer gradeId;

    private Date addTime;

    private Date lastUpdate;

    public Integer getGrastuId() {
        return grastuId;
    }

    public void setGrastuId(Integer grastuId) {
        this.grastuId = grastuId;
    }

    public String getGrastuDesc() {
        return grastuDesc;
    }

    public void setGrastuDesc(String grastuDesc) {
        this.grastuDesc = grastuDesc == null ? null : grastuDesc.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
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