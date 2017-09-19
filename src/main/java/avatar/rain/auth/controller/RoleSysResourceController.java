/***********************************************************************
 * @模块: 角色资源业务逻辑实现
 * @模块说明: 角色资源模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.RoleSysResourceDao;
import avatar.rain.auth.entity.RoleSysResource;
import avatar.rain.auth.service.RoleSysResourceService;
import avatar.rain.common.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/roleSysResource")
public class RoleSysResourceController extends BaseController<RoleSysResourceService, RoleSysResourceDao, RoleSysResource> {

    @Resource
    private RoleSysResourceService roleSysResourceService;

    @Override
    protected RoleSysResourceService getService() {
        return roleSysResourceService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public RoleSysResource getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}