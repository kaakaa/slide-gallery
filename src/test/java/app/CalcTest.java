package app;

import javafx.application.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalcTest extends JerseyTest {

    @Test
    public void test() {
        int c = target("calc/add").queryParam("a", 2).queryParam("b", 3).request().get(int.class);
        assertThat(c, is(5));
    }

    @Override
    protected javax.ws.rs.core.Application configure() {
        return new ResourceConfig(Calc.class);
    }
}