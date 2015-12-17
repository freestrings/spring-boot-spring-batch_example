package fs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
public class AppTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void preventCommandLineRunner() {
        // do nothing
    }

    @Test
    public void execCommandLineRunner() throws Exception {
        App.SimpleCommandLineRunner runner
                = context.getBean(App.SimpleCommandLineRunner.class);
        runner.run(new String[]{});
    }
}
