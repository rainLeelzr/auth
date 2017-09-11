package avatar.rain.auth.service;

import avatar.rain.BaseServiceTestClass;
import avatar.rain.auth.dao.ThirdPartyUserDao;
import avatar.rain.auth.entity.ThirdPartyUser;
import avatar.rain.core.util.pk.PkGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ThirdPartyUserServiceTest extends BaseServiceTestClass<ThirdPartyUser, ThirdPartyUserDao, ThirdPartyUserService> {

    @Resource(name = "thirdPartyUserService")
    private ThirdPartyUserService thirdPartyUserService;

    @Override
    protected ThirdPartyUserService getService() {
        return thirdPartyUserService;
    }

    @Override
    public ThirdPartyUser genEntity() {
        ThirdPartyUser entity = new ThirdPartyUser();
        entity.setUserId(PkGenerator.getPk());
        entity.setLoginType((byte) RandomUtils.nextInt(1, 5));
        entity.setAccessTime(RandomUtils.nextLong());
        entity.setUniqueId(RandomStringUtils.randomNumeric(5));
        return entity;
    }

}