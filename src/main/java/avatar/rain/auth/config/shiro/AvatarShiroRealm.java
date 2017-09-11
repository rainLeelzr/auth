package avatar.rain.auth.config.shiro;

import avatar.rain.auth.entity.Role;
import avatar.rain.auth.entity.SysResource;
import avatar.rain.auth.entity.User;
import avatar.rain.auth.model.LoginUser;
import avatar.rain.auth.service.LoginService;
import avatar.rain.auth.service.RoleServiceExt;
import avatar.rain.auth.service.SysResourceServiceExt;
import avatar.rain.auth.service.UserServiceExt;
import avatar.rain.base.service.ParamCache;
import avatar.rain.base.service.ResultService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class AvatarShiroRealm extends AuthorizingRealm implements InitializingBean {

    @Resource
    private RoleServiceExt roleServiceExt;

    @Resource
    private SysResourceServiceExt sysResourceServiceExt;

    @Resource
    private UserServiceExt userServiceExt;

    @Resource
    private LoginService loginService;

    @Resource
    private ResultService resultService;

    @Resource
    private CredentialsMatcher credentialsMatcher;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        LoginUser loginUser = (LoginUser) principals.getPrimaryPrincipal();
        List<Role> roles = roleServiceExt.getByUserId(loginUser.getUserId());
        for (Role role : roles) {
            if (!ParamCache.enable.equals(role.getEnabled())) {
                continue;
            }

            authorizationInfo.addRole(role.getId());
            List<SysResource> sysResources = sysResourceServiceExt.getByRoleId(role.getId());
            for (SysResource sysResource : sysResources) {
                authorizationInfo.addStringPermission(sysResource.getId());
            }
        }
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        User user = userServiceExt.getByAccount(username);
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(
                user, // 登录用户
                user.getPwd(), // 登录用户输入的密码
                getName()  //realm name
        );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setCredentialsMatcher(credentialsMatcher);
    }
}
