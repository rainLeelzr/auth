/***********************************************************************
 * @模块: 参数业务逻辑实现
 * @模块说明: 参数模块服务
 ***********************************************************************/

package avatar.rain.base.controller;

import avatar.rain.base.dao.ParamDao;
import avatar.rain.base.entity.Param;
import avatar.rain.base.service.ParamService;
import avatar.rain.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/base/param")
public class ParamControllerExt extends BaseController<ParamService, ParamDao, Param> {

    @Resource
    private ParamService paramService;

    @Override
    protected ParamService getService() {
        return paramService;
    }

    @RequestMapping("/")
    public String page() {
        return "avatar/rain/base/param/list";
    }

}