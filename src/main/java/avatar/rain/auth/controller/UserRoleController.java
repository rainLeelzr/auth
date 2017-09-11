/***********************************************************************
 * @模块: 用户角色业务逻辑实现
 * @模块说明: 用户角色模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.UserRoleDao;
import avatar.rain.auth.entity.UserRole;
import avatar.rain.auth.service.UserRoleService;
import avatar.rain.core.controller.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/userRole")
public class UserRoleController extends BaseController<UserRoleService, UserRoleDao, UserRole> {

    @Resource
    private UserRoleService userRoleService;

    @Override
    protected UserRoleService getService() {
        return userRoleService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public UserRole getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}