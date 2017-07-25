package cn.bdqn.tangcco.entity;

import java.util.Date;

public class UserInfo {
    private Integer userinfoId;

    private String userinfoName;

    private Date birthday;

    private String phone;

    private String email;

    private Date joinDate;

    private String nickName;

    private Integer schoolId;

    private String idNum;

    private String birthPlace;

    private Date lastUpdate;

    private Date addTime;

    private Integer userinfoStatus;

    public UserInfo() {
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userinfoId=" + userinfoId +
                ", userinfoName='" + userinfoName + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", joinDate=" + joinDate +
                ", nickName='" + nickName + '\'' +
                ", schoolId=" + schoolId +
                ", idNum='" + idNum + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", addTime=" + addTime +
                ", userinfoStatus=" + userinfoStatus +
                '}';
    }

    public UserInfo(Integer userinfoId, String userinfoName, Date birthday, String phone, String email, Date joinDate, String nickName, Integer schoolId, String idNum, String birthPlace, Date lastUpdate, Date addTime, Integer userinfoStatus) {
        this.userinfoId = userinfoId;
        this.userinfoName = userinfoName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.joinDate = joinDate;
        this.nickName = nickName;
        this.schoolId = schoolId;
        this.idNum = idNum;
        this.birthPlace = birthPlace;
        this.lastUpdate = lastUpdate;
        this.addTime = addTime;
        this.userinfoStatus = userinfoStatus;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public String getUserinfoName() {
        return userinfoName;
    }

    public void setUserinfoName(String userinfoName) {
        this.userinfoName = userinfoName == null ? null : userinfoName.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getUserinfoStatus() {
        return userinfoStatus;
    }

    public void setUserinfoStatus(Integer userinfoStatus) {
        this.userinfoStatus = userinfoStatus;
    }
}