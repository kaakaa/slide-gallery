package app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by kaakaa_hoe on 2015/11/28.
 */
@Path("calc")
public class Calc {
    @Path("add")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int add(@QueryParam("a") int a, @QueryParam("b") int b) {
        return a + b;
    }
}
