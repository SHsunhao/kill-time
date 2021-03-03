package com.zz.model_two.po;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors
public class TUserAuthority {
    private Integer userAuthorityId;

    private Long userId;

    private Integer authorityId;

    public Integer getUserAuthorityId() {
        return userAuthorityId;
    }

    public void setUserAuthorityId(Integer userAuthorityId) {
        this.userAuthorityId = userAuthorityId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }
}