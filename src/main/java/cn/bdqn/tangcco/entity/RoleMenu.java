package cn.bdqn.tangcco.entity;

import java.util.Date;

public class RoleMenu {
    private Integer rolmenId;

    private Role role;

    private String rolmenDesc;

    private Menu menu;

    private Date addTime;

    private Date lastUpdate;

    @Override
    public String toString() {
        return "RoleMenu{" +
                "rolmenId=" + rolmenId +
                ", role=" + role +
                ", rolmenDesc='" + rolmenDesc + '\'' +
                ", menu=" + menu +
                ", addTime=" + addTime +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    public RoleMenu(Integer rolmenId, Role role, String rolmenDesc, Menu menu, Date addTime, Date lastUpdate) {
        this.rolmenId = rolmenId;
        this.role = role;
        this.rolmenDesc = rolmenDesc;
        this.menu = menu;
        this.addTime = addTime;
        this.lastUpdate = lastUpdate;
    }

    public Integer getRolmenId() {
        return rolmenId;
    }

    public void setRolmenId(Integer rolmenId) {
        this.rolmenId = rolmenId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getRolmenDesc() {
        return rolmenDesc;
    }

    public void setRolmenDesc(String rolmenDesc) {
        this.rolmenDesc = rolmenDesc;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
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

    public RoleMenu() {
    }
}