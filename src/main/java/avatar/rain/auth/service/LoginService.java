/***********************************************************************
 * @模块: 登录日志业务逻辑实现
 * @模块说明: 登录日志模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.dao.UserDaoExt;
import avatar.rain.auth.entity.User;
import avatar.rain.base.entity.ErrorInfo;
import avatar.rain.base.service.ErrorInfoServiceExt;
import avatar.rain.result.Result;
import avatar.rain.base.service.ResultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {

    @Resource
    private UserDaoExt userDaoExt;

    @Resource
    private ErrorInfoServiceExt errorInfoServiceExt;

    @Resource
    private ResultService resultService;

    /**
     * 根据用户名和密码登录系统
     *
     * @param account 用户名
     * @param pwd     密码
     */
    public Result login(String account, String pwd) {
        User user = userDaoExt.getByAccount(account);
        if (user == null) {
            ErrorInfo errorInfo = errorInfoServiceExt.getByKey("login_account_error");
            return resultService.parseFromErrorInfo(errorInfo);
        }

        if (!user.getPwd().equals(pwd)) {
            ErrorInfo errorInfo = errorInfoServiceExt.getByKey("login_pwd_error");
            return resultService.parseFromErrorInfo(errorInfo);
        }

        return resultService.parseFromSuccessData(user);
    }
}