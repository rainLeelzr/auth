/***********************************************************************
 * @模块: 角色业务逻辑实现
 * @模块说明: 角色模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.RoleDao;
import avatar.rain.auth.entity.Role;
import avatar.rain.auth.service.RoleService;
import avatar.rain.core.controller.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/role")
public class RoleController extends BaseController<RoleService, RoleDao, Role> {

    @Resource
    private RoleService roleService;

    @Override
    protected RoleService getService() {
        return roleService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public Role getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}