/***********************************************************************
 * @模块: 登录日志业务逻辑实现
 * @模块说明: 登录日志模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.LoginLogDao;
import avatar.rain.auth.entity.LoginLog;
import avatar.rain.common.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginLogService extends BaseService<LoginLog, LoginLogDao> {

    @Resource
    private LoginLogDao loginLogDao;

    @Override
    protected LoginLogDao getDao() {
        return loginLogDao;
    }

}