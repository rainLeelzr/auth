/***********************************************************************
 * @模块: 第三方系统用户业务逻辑实现
 * @模块说明: 第三方系统用户模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.ThirdPartyUserDao;
import avatar.rain.auth.entity.ThirdPartyUser;
import avatar.rain.common.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ThirdPartyUserService extends BaseService<ThirdPartyUser, ThirdPartyUserDao> {

    @Resource
    private ThirdPartyUserDao thirdPartyUserDao;

    @Override
    protected ThirdPartyUserDao getDao() {
        return thirdPartyUserDao;
    }

}