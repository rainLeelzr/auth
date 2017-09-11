/***********************************************************************
 * @模块: 角色权限业务逻辑实现
 * @模块说明: 角色权限模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.RoleSysPermissionDao;
import avatar.rain.auth.entity.RoleSysPermission;
import avatar.rain.auth.service.RoleSysPermissionService;
import avatar.rain.core.controller.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/roleSysPermission")
public class RoleSysPermissionController extends BaseController<RoleSysPermissionService, RoleSysPermissionDao, RoleSysPermission> {

    @Resource
    private RoleSysPermissionService roleSysPermissionService;

    @Override
    protected RoleSysPermissionService getService() {
        return roleSysPermissionService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public RoleSysPermission getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}