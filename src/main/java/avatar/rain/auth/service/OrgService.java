/***********************************************************************
 * @模块: 组织业务逻辑实现
 * @模块说明: 组织模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.OrgDao;
import avatar.rain.auth.entity.Org;
import avatar.rain.core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrgService extends BaseService<Org, OrgDao> {

    @Resource
    private OrgDao orgDao;

    @Override
    protected OrgDao getDao() {
        return orgDao;
    }

}