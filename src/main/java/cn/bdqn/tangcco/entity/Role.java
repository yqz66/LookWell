package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Role {
    private Integer roleId;

    private String roleName;

    private Integer roleLevel;

    private Date addTime;

    private Date lastUpdate;

    private Integer roleStatus;

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleLevel=" + roleLevel +
                ", addTime=" + addTime +
                ", lastUpdate=" + lastUpdate +
                ", roleStatus=" + roleStatus +
                '}';
    }

    public Role(Integer roleId, String roleName, Integer roleLevel, Date addTime, Date lastUpdate, Integer roleStatus) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleLevel = roleLevel;
        this.addTime = addTime;
        this.lastUpdate = lastUpdate;
        this.roleStatus = roleStatus;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
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

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }
}