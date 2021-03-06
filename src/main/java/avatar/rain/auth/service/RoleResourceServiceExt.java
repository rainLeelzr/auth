/***********************************************************************
 * @模块: 角色资源业务逻辑实现
 * @模块说明: 角色资源模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.entity.RoleResource;
import avatar.rain.core.database.SqlCondition;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleResourceServiceExt extends RoleResourceService {

    public List<RoleResource> getByRoleId(String roleId) {
        return getDao().findPage(new SqlCondition().where(RoleResource.ROLEID, roleId).build());
    }

    public List<String> getSysResourceIdsByRoleId(String roleId) {
        List<RoleResource> page = getDao().findPage(
                new SqlCondition()
                        .select(RoleResource.RESOURCEID)
                        .where(RoleResource.ROLEID, roleId)
                        .build());
        return page.stream().map(RoleResource::getResourceId).collect(Collectors.toList());
    }

}