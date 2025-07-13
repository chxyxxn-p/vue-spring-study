package com.cyp.study.dto;

public class UserDTO {
    private String name;
    private String phone;
    private String birth;

    // 기본 생성자
    public UserDTO() {}

    // getter & setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
}
