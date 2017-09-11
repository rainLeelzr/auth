/***********************************************************************
 * @模块: 组织业务逻辑实现
 * @模块说明: 组织模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.OrgDao;
import avatar.rain.auth.entity.Org;
import avatar.rain.auth.service.OrgService;
import avatar.rain.core.controller.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/org")
public class OrgController extends BaseController<OrgService, OrgDao, Org> {

    @Resource
    private OrgService orgService;

    @Override
    protected OrgService getService() {
        return orgService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public Org getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}