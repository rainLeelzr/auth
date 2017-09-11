package avatar.rain.base;

import avatar.rain.base.service.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ParamServiceTest.class,
        ErrorInfoServiceTest.class
})
public class BaseTestSuite {
}