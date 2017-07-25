package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Course {
    private Integer courseId;

    private Integer termId;

    private Date addTime;

    private Date lastUpdate;

    private byte[] courseName;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
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

    public byte[] getCourseName() {
        return courseName;
    }

    public void setCourseName(byte[] courseName) {
        this.courseName = courseName;
    }
}