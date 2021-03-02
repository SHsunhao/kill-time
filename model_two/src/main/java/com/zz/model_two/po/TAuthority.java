package com.zz.model_two.po;

public class TAuthority {
    private Integer authorityId;

    private String authorityScope;

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityScope() {
        return authorityScope;
    }

    public void setAuthorityScope(String authorityScope) {
        this.authorityScope = authorityScope == null ? null : authorityScope.trim();
    }
}