/***********************************************************************
 * @模块: 错误信息业务逻辑实现
 * @模块说明: 错误信息模块服务
 ***********************************************************************/

package avatar.rain.base.service;

import avatar.rain.base.dao.ErrorInfoDao;
import avatar.rain.base.entity.ErrorInfo;
import avatar.rain.common.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ErrorInfoService extends BaseService<ErrorInfo, ErrorInfoDao> {

    @Resource
    private ErrorInfoDao errorInfoDao;

    @Override
    protected ErrorInfoDao getDao() {
        return errorInfoDao;
    }

}