package avatar.rain.auth.service;

import avatar.rain.BaseServiceTestClass;
import avatar.rain.auth.dao.RoleSysPermissionDao;
import avatar.rain.auth.entity.RoleSysPermission;
import avatar.rain.core.util.pk.PkGenerator;
import org.apache.commons.lang3.RandomStringUtils;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleSysPermissionServiceTest extends BaseServiceTestClass<RoleSysPermission, RoleSysPermissionDao, RoleSysPermissionService> {

    @Resource(name = "roleSysPermissionService")
    private RoleSysPermissionService roleSysPermissionService;

    @Override
    protected RoleSysPermissionService getService() {
        return roleSysPermissionService;
    }

    @Override
    public RoleSysPermission genEntity() {
        RoleSysPermission entity = new RoleSysPermission();
        entity.setRoleId(PkGenerator.getPk());
        entity.setSysPermissionId(PkGenerator.getPk());
        return entity;
    }

}