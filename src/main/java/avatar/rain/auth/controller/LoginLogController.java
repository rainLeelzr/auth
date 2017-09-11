/***********************************************************************
 * @模块: 登录日志业务逻辑实现
 * @模块说明: 登录日志模块服务
 ***********************************************************************/

package avatar.rain.auth.controller;

import avatar.rain.auth.dao.LoginLogDao;
import avatar.rain.auth.entity.LoginLog;
import avatar.rain.auth.service.LoginLogService;
import avatar.rain.core.controller.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/loginLog")
public class LoginLogController extends BaseController<LoginLogService, LoginLogDao, LoginLog> {

    @Resource
    private LoginLogService loginLogService;

    @Override
    protected LoginLogService getService() {
        return loginLogService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public LoginLog getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}