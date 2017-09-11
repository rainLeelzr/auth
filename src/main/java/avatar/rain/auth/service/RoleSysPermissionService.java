/***********************************************************************
 * @模块: 角色权限业务逻辑实现
 * @模块说明: 角色权限模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.RoleSysPermissionDao;
import avatar.rain.auth.entity.RoleSysPermission;
import avatar.rain.core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleSysPermissionService extends BaseService<RoleSysPermission, RoleSysPermissionDao> {

    @Resource
    private RoleSysPermissionDao roleSysPermissionDao;

    @Override
    protected RoleSysPermissionDao getDao() {
        return roleSysPermissionDao;
    }

}