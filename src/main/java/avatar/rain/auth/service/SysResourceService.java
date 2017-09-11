/***********************************************************************
 * @模块: 系统资源业务逻辑实现
 * @模块说明: 系统资源模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.SysResourceDao;
import avatar.rain.auth.entity.SysResource;
import avatar.rain.core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysResourceService extends BaseService<SysResource, SysResourceDao> {

    @Resource
    private SysResourceDao sysResourceDao;

    @Override
    protected SysResourceDao getDao() {
        return sysResourceDao;
    }

}