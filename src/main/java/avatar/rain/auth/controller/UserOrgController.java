/***********************************************************************
 * @模块: 用户组织业务逻辑实现
 * @模块说明: 用户组织模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.UserOrgDao;
import avatar.rain.auth.entity.UserOrg;
import avatar.rain.auth.service.UserOrgService;
import avatar.rain.common.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/userOrg")
public class UserOrgController extends BaseController<UserOrgService, UserOrgDao, UserOrg> {

    @Resource
    private UserOrgService userOrgService;

    @Override
    protected UserOrgService getService() {
        return userOrgService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public UserOrg getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}