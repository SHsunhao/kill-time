package com.zz.model_two.po;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors
public class TUser {
    private Long userId;

    private String userNumber;

    private String userPassword;

    private String phone;

    private String sex;

    private Boolean kind;

    private Integer userAuthorityId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Boolean getKind() {
        return kind;
    }

    public void setKind(Boolean kind) {
        this.kind = kind;
    }

    public Integer getUserAuthorityId() {
        return userAuthorityId;
    }

    public void setUserAuthorityId(Integer userAuthorityId) {
        this.userAuthorityId = userAuthorityId;
    }
}