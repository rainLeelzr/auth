/***********************************************************************
 * @模块: 用户信息业务逻辑实现
 * @模块说明: 用户信息模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.UserInfoDao;
import avatar.rain.auth.entity.UserInfo;
import avatar.rain.common.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoService extends BaseService<UserInfo, UserInfoDao> {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    protected UserInfoDao getDao() {
        return userInfoDao;
    }

}