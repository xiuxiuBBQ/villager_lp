package com.lp.pojo;

import java.util.Date;

public class Village {
    private Integer vid;//id
    private String vname;//姓名
    private String sex;//性别
    private Date birthday;//生日
    private String nation;//民族
    private String idcard;//身份证号
    private String phone;//电话号码
    private String marriage;//婚姻状况
    private String edu;//学历
    private String military;//服役状况
    private String policy;//政治面貌
    private String work;//工作

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getMilitary() {
        return military;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Village{" +
                "vid=" + vid +
                ", vname='" + vname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", nation='" + nation + '\'' +
                ", idcard='" + idcard + '\'' +
                ", phone='" + phone + '\'' +
                ", marriage='" + marriage + '\'' +
                ", edu='" + edu + '\'' +
                ", military='" + military + '\'' +
                ", policy='" + policy + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
