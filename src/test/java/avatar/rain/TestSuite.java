package avatar.rain;

import avatar.rain.auth.AuthTestSuite;
import avatar.rain.base.BaseTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AuthTestSuite.class,
        BaseTestSuite.class
})
public class TestSuite {
}
