/***********************************************************************
 * @模块: 参数业务逻辑实现
 * @模块说明: 参数模块服务
 ***********************************************************************/

package avatar.rain.base.service;

import avatar.rain.base.dao.ParamDao;
import avatar.rain.base.entity.Param;
import avatar.rain.core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ParamService extends BaseService<Param, ParamDao> {

    @Resource
    private ParamDao paramDao;

    @Override
    protected ParamDao getDao() {
        return paramDao;
    }

}