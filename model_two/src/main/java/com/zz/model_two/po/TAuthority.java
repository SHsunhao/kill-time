package com.zz.model_two.po;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors
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