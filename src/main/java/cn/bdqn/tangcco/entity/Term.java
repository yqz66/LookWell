package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Term {
    private Integer termId;

    private Integer projectId;

    private String termName;

    private Date addTime;

    private Date lasTupdate;

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName == null ? null : termName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLasTupdate() {
        return lasTupdate;
    }

    public void setLasTupdate(Date lasTupdate) {
        this.lasTupdate = lasTupdate;
    }
}