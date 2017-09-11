package avatar.rain.auth.service;

import avatar.rain.BaseServiceTestClass;
import avatar.rain.auth.dao.UserOrgDao;
import avatar.rain.auth.entity.UserOrg;
import avatar.rain.core.util.pk.PkGenerator;
import org.apache.commons.lang3.RandomStringUtils;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserOrgServiceTest extends BaseServiceTestClass<UserOrg, UserOrgDao, UserOrgService> {

    @Resource(name = "userOrgService")
    private UserOrgService userOrgService;

    @Override
    protected UserOrgService getService() {
        return userOrgService;
    }

    @Override
    public UserOrg genEntity() {
        UserOrg entity = new UserOrg();
        entity.setUserId(PkGenerator.getPk());
        entity.setOrgId(PkGenerator.getPk());
        return entity;
    }

}