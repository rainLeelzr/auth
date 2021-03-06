package avatar.rain.base.service;

import avatar.rain.base.entity.ErrorInfo;
import avatar.rain.result.Result;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ResultService implements InitializingBean {

    @Resource
    private ErrorInfoServiceExt errorInfoServiceExt;

    private ErrorInfo success;

    private ErrorInfo fail;

    public Result parseFromErrorInfo(ErrorInfo errorInfo) {
        return new Result(errorInfo.getCode(), errorInfo.getMsg());
    }

    public Result parseFromSuccessData(Object data) {
        return new Result(success.getCode(), success.getMsg(), data);
    }

    public boolean isSuccess(Result result) {
        return result != null && success.getCode().equals(result.getCode());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        success = errorInfoServiceExt.getByKey(ErrorInfoCache.SUCCESS_KEY);
        fail = errorInfoServiceExt.getByKey(ErrorInfoCache.FAIL_KEY);
    }
}
