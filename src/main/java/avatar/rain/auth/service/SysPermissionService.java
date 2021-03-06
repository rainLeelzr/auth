/***********************************************************************
 * @模块: 系统权限业务逻辑实现
 * @模块说明: 系统权限模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.SysPermissionDao;
import avatar.rain.auth.entity.SysPermission;
import avatar.rain.common.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysPermissionService extends BaseService<SysPermission, SysPermissionDao> {

    @Resource
    private SysPermissionDao sysPermissionDao;

    @Override
    protected SysPermissionDao getDao() {
        return sysPermissionDao;
    }

}