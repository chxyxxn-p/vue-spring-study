package com.cyp.study.dto;

public class responseDTO {
    private String name;
    private String phone;
    private int koreanAge;
    private int internationalAge;

    // 기본 생성자
    public responseDTO() {}

    public responseDTO(String name, String phone, int koreanAge, int internationalAge) {
        this.name = name;
        this.phone = phone;
        this.koreanAge = koreanAge;
        this.internationalAge = internationalAge;
    }

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
    public int getKoreanAge() {
        return koreanAge;
    }
    public void setKoreanAge(int koreanAge) {
        this.koreanAge = koreanAge;
    }
    public int getInternationalAge() {
        return internationalAge;
    }
    public void setInternationalAge(int internationalAge) {
        this.internationalAge = internationalAge;
    }
}
