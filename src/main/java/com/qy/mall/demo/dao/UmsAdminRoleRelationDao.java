package com.qy.mall.demo.dao;

import com.qy.mall.demo.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色自定义Dao
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 获取所有用户的权限
     */
    List<UmsPermission> getPermissionList(@Param("adminId")Long adminId);
}
