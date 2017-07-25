package cn.bdqn.tangcco.entity;

import java.util.Date;

public class RoleMenu {
    private Integer rolmenId;

    private Integer roleId;

    private String rolmenDesc;

    private Integer menuId;

    private Date addTime;

    private Date lastUpdate;

    public Integer getRolmenId() {
        return rolmenId;
    }

    public void setRolmenId(Integer rolmenId) {
        this.rolmenId = rolmenId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRolmenDesc() {
        return rolmenDesc;
    }

    public void setRolmenDesc(String rolmenDesc) {
        this.rolmenDesc = rolmenDesc == null ? null : rolmenDesc.trim();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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