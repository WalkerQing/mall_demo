package com.qy.mall.demo.service;

import com.qy.mall.demo.mbg.model.UmsAdmin;
import com.qy.mall.demo.mbg.model.UmsPermission;

import java.util.List;

public interface UmsAdminService {
    UmsAdmin getAdminByUsername(String username);
    List<UmsPermission> getPermissionList(Long id);
}
