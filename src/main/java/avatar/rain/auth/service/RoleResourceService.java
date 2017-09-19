/***********************************************************************
 * @模块: 角色资源业务逻辑实现
 * @模块说明: 角色资源模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.RoleResourceDao;
import avatar.rain.auth.entity.RoleResource;
import avatar.rain.common.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleResourceService extends BaseService<RoleResource, RoleResourceDao> {

    @Resource
    private RoleResourceDao roleResourceDao;

    @Override
    protected RoleResourceDao getDao() {
        return roleResourceDao;
    }

}