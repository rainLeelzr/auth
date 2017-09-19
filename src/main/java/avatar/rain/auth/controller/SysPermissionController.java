/***********************************************************************
 * @模块: 系统权限业务逻辑实现
 * @模块说明: 系统权限模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.SysPermissionDao;
import avatar.rain.auth.entity.SysPermission;
import avatar.rain.auth.service.SysPermissionService;
import avatar.rain.common.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/sysPermission")
public class SysPermissionController extends BaseController<SysPermissionService, SysPermissionDao, SysPermission> {

    @Resource
    private SysPermissionService sysPermissionService;

    @Override
    protected SysPermissionService getService() {
        return sysPermissionService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public SysPermission getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}