/***********************************************************************
 * @模块: 角色资源业务逻辑实现
 * @模块说明: 角色资源模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.RoleSysResourceDao;
import avatar.rain.auth.entity.RoleSysResource;
import avatar.rain.common.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleSysResourceService extends BaseService<RoleSysResource, RoleSysResourceDao> {

    @Resource
    private RoleSysResourceDao roleSysResourceDao;

    @Override
    protected RoleSysResourceDao getDao() {
        return roleSysResourceDao;
    }

}