/***********************************************************************
 * @模块: 系统资源业务逻辑实现
 * @模块说明: 系统资源模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.SysResourceDao;
import avatar.rain.auth.entity.SysResource;
import avatar.rain.auth.service.SysResourceService;
import avatar.rain.core.controller.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/sysResource")
public class SysResourceController extends BaseController<SysResourceService, SysResourceDao, SysResource> {

    @Resource
    private SysResourceService sysResourceService;

    @Override
    protected SysResourceService getService() {
        return sysResourceService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public SysResource getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}