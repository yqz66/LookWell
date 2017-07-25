package cn.bdqn.tangcco.entity;

public class Teacher {
    private Integer teacherId;

    private Integer departmentId;

    private String teacherDesc;

    private Integer userId;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getTeacherDesc() {
        return teacherDesc;
    }

    public void setTeacherDesc(String teacherDesc) {
        this.teacherDesc = teacherDesc == null ? null : teacherDesc.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}