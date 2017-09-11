package avatar.rain.auth.service;

import avatar.rain.BaseServiceTestClass;
import avatar.rain.auth.dao.UserRoleDao;
import avatar.rain.auth.entity.UserRole;
import avatar.rain.core.util.pk.PkGenerator;
import org.apache.commons.lang3.RandomStringUtils;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRoleServiceTest extends BaseServiceTestClass<UserRole, UserRoleDao, UserRoleService> {

    @Resource(name = "userRoleService")
    private UserRoleService userRoleService;

    @Override
    protected UserRoleService getService() {
        return userRoleService;
    }

    @Override
    public UserRole genEntity() {
        UserRole entity = new UserRole();
        entity.setUserId(PkGenerator.getPk());
        entity.setRoleId(PkGenerator.getPk());
        return entity;
    }

}