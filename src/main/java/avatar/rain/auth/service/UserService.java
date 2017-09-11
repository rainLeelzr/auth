/***********************************************************************
 * @模块: 用户业务逻辑实现
 * @模块说明: 用户模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.UserDao;
import avatar.rain.auth.entity.User;
import avatar.rain.core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService extends BaseService<User, UserDao> {

    @Resource
    private UserDao userDao;

    @Override
    protected UserDao getDao() {
        return userDao;
    }

}