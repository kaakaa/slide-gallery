package app.controller;

import app.model.TopInfo;
import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;

/**
 * Created by kaakaa_hoe on 2015/11/28.
 */
@Path("/top")
public class Top {
    @GET
    public Viewable test() {
        final TopInfo topInfo = new TopInfo(LocalDateTime.now(), "Hoge", "Fuga");
        return new Viewable("/top/top", topInfo);
    }
}
