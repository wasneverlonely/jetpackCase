package com.was.jetpackcase.bean;

public class UserBean {

    private int id; //id
    private String name;//姓名
    private int sex; // 0女  1男
    private String no;//身份证号

    public UserBean() {

    }

    public UserBean(int id, String name, int sex, String no) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }


}
