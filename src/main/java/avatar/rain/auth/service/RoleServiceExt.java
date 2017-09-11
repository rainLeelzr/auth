/***********************************************************************
 * @模块: 角色业务逻辑实现
 * @模块说明: 角色模块服务
 ***********************************************************************/

package avatar.rain.auth.service;

import avatar.rain.auth.entity.Role;
import avatar.rain.core.database.SqlCondition;
import avatar.rain.core.entity.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceExt extends RoleService {

    public List<Role> getByUserId(String userId) {
        return getDao().findPage(new SqlCondition().where(BaseEntity.ID, userId).build());
    }
}