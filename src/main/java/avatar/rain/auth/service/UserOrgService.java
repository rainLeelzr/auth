/***********************************************************************
 * @模块: 用户组织业务逻辑实现
 * @模块说明: 用户组织模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.UserOrgDao;
import avatar.rain.auth.entity.UserOrg;
import avatar.rain.core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserOrgService extends BaseService<UserOrg, UserOrgDao> {

    @Resource
    private UserOrgDao userOrgDao;

    @Override
    protected UserOrgDao getDao() {
        return userOrgDao;
    }

}