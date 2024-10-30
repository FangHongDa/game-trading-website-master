package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hlt
 * @since 2019-12-25
 */
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@Data
@Accessors(chain = true)//链式写法
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

	private String userid;
    /**
     * 1普通用户 2管理员 3超级管理员
     */
	private Integer roleid;
    /**
     * 身份
     */
	private String identity;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserid() {
        return userid;
    }

    public UserRole setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public UserRole setRoleid(Integer roleid) {
        this.roleid = roleid;
        return this;
    }

    public String getIdentity() {
        return identity;
    }

    public UserRole setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
}
