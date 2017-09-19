/***********************************************************************
 * @模块: 参数业务逻辑实现
 * @模块说明: 参数模块服务
 ***********************************************************************/

package avatar.rain.base.controller;

import avatar.rain.base.dao.ParamDao;
import avatar.rain.base.entity.Param;
import avatar.rain.base.service.ParamService;
import avatar.rain.common.BaseController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/base/param")
public class ParamController extends BaseController<ParamService, ParamDao, Param> {

    @Resource
    private ParamService paramService;

    @Override
    protected ParamService getService() {
        return paramService;
    }

    @Override
    @RequestMapping("/id/{id}")
    public Param getEntityById(@PathVariable String id) {
        return super.getEntityById(id);
    }

}