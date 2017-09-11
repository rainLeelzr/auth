package avatar.rain.auth.service;

import avatar.rain.BaseServiceTestClass;
import avatar.rain.auth.dao.RoleSysResourceDao;
import avatar.rain.auth.entity.RoleSysResource;
import avatar.rain.core.util.pk.PkGenerator;
import org.apache.commons.lang3.RandomStringUtils;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleSysResourceServiceTest extends BaseServiceTestClass<RoleSysResource, RoleSysResourceDao, RoleSysResourceService> {

    @Resource(name = "roleSysResourceService")
    private RoleSysResourceService roleSysResourceService;

    @Override
    protected RoleSysResourceService getService() {
        return roleSysResourceService;
    }

    @Override
    public RoleSysResource genEntity() {
        RoleSysResource entity = new RoleSysResource();
        entity.setRoleId(PkGenerator.getPk());
        entity.setSysResourceId(PkGenerator.getPk());
        return entity;
    }

}