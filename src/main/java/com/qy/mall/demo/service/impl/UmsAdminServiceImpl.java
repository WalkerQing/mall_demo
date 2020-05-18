package com.qy.mall.demo.service.impl;

import com.qy.mall.demo.mbg.mapper.UmsAdminMapper;
import com.qy.mall.demo.mbg.model.UmsAdmin;
import com.qy.mall.demo.mbg.model.UmsAdminExample;
import com.qy.mall.demo.mbg.model.UmsPermission;
import com.qy.mall.demo.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminMapper umsAdminMapper;
    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample umsAdminExample = new UmsAdminExample();
        UmsAdminExample.Criteria criteria = umsAdminExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectByExample(umsAdminExample);
        if(null != umsAdmins && umsAdmins.size()>0){
            return umsAdmins.get(0);
        }
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long id) {
        return null;
    }
}
