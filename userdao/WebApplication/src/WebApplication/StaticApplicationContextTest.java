package WebApplication;

import org.junit.Test;


/**
 * Created by Jaewon on 2015-05-01.
 */
public class StaticApplicationContextTest {

    @Test
    public void applicationContext() {
        StaticApplicationContextTest applicationContextTest = new StaticApplicationContextTest();
        applicationContextTest.registerSingleton("hello", HelloImpl.class);
        Hello hell = applicationContextiTest.getBean("hello", Hello.sayHello());

    }
}

