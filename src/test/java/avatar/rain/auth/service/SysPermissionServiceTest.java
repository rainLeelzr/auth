package avatar.rain.auth.service;

import avatar.rain.BaseServiceTestClass;
import avatar.rain.auth.dao.SysPermissionDao;
import avatar.rain.auth.entity.SysPermission;
import avatar.rain.core.util.pk.PkGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SysPermissionServiceTest extends BaseServiceTestClass<SysPermission, SysPermissionDao, SysPermissionService> {

    @Resource(name = "sysPermissionService")
    private SysPermissionService sysPermissionService;

    @Override
    protected SysPermissionService getService() {
        return sysPermissionService;
    }

    @Override
    public SysPermission genEntity() {
        SysPermission entity = new SysPermission();
        entity.setSysResourceId(PkGenerator.getPk());
        entity.setName(RandomStringUtils.randomNumeric(5));
        entity.setCode(RandomStringUtils.randomNumeric(5));
        entity.setOrderNum((byte) RandomUtils.nextInt(1, 5));
        entity.setRemark(RandomStringUtils.randomNumeric(5));
        return entity;
    }

}