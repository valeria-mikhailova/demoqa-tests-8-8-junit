package com.mikhailovavalery.domain;

public enum RegistrationPageEnum {

    MALE ("Male"),
    FEMALE ("Female"),
    OTHER ("Other");


    private String sex;

    RegistrationPageEnum(String sex) {this.sex = sex;}

    public String getSex() {
        return sex;
    }

}
