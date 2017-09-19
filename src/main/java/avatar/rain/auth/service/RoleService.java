/***********************************************************************
 * @模块: 角色业务逻辑实现
 * @模块说明: 角色模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.RoleDao;
import avatar.rain.auth.entity.Role;
import avatar.rain.common.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleService extends BaseService<Role, RoleDao> {

    @Resource
    private RoleDao roleDao;

    @Override
    protected RoleDao getDao() {
        return roleDao;
    }

}