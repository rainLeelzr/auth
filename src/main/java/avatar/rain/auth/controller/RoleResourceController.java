/***********************************************************************
 * @模块: 角色资源业务逻辑实现
 * @模块说明: 角色资源模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.RoleResourceDao;
import avatar.rain.auth.entity.RoleResource;
import avatar.rain.auth.service.RoleResourceService;
import avatar.rain.common.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/roleResource")
public class RoleResourceController extends BaseController<RoleResourceService, RoleResourceDao, RoleResource> {

    @Resource
    private RoleResourceService roleResourceService;

    @Override
    protected RoleResourceService getService() {
        return roleResourceService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public RoleResource getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}