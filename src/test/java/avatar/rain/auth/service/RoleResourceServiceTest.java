package avatar.rain.auth.service;

import avatar.rain.BaseServiceTestClass;
import avatar.rain.auth.dao.RoleResourceDao;
import avatar.rain.auth.entity.RoleResource;
import avatar.rain.core.util.pk.PkGenerator;
import org.apache.commons.lang3.RandomStringUtils;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleResourceServiceTest extends BaseServiceTestClass<RoleResource, RoleResourceDao, RoleResourceService> {

    @Resource(name = "roleResourceService")
    private RoleResourceService roleResourceService;

    @Override
    protected RoleResourceService getService() {
        return roleResourceService;
    }

    @Override
    public RoleResource genEntity() {
        RoleResource entity = new RoleResource();
        entity.setRoleId(PkGenerator.getPk());
        entity.setResourceId(PkGenerator.getPk());
        return entity;
    }

}