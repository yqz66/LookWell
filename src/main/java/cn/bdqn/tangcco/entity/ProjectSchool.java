package cn.bdqn.tangcco.entity;

public class ProjectSchool {
    private Integer proschId;

    private Integer projectId;

    private Integer schoolId;

    private String proschDesc;

    public Integer getProschId() {
        return proschId;
    }

    public void setProschId(Integer proschId) {
        this.proschId = proschId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getProschDesc() {
        return proschDesc;
    }

    public void setProschDesc(String proschDesc) {
        this.proschDesc = proschDesc == null ? null : proschDesc.trim();
    }
}