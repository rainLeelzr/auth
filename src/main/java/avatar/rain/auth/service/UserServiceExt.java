/***********************************************************************
 * @模块: 用户业务逻辑实现
 * @模块说明: 用户模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.UserDaoExt;
import avatar.rain.auth.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceExt extends UserService {

    @Resource
    private UserDaoExt userDaoExt;

    @Override
    @Cacheable("user:id")
    public User getById(String id) {
        return super.getById(id);
    }


    @Caching(cacheable = {@Cacheable("user:account")})
    public User getByAccount(String account) {
        return userDaoExt.getByAccount(account);
    }
}