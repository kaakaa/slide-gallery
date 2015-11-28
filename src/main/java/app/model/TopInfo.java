package app.model;

import java.time.LocalDateTime;

/**
 * Created by kaakaa_hoe on 2015/11/28.
 */
public class TopInfo {
    public final LocalDateTime now;
    public final String lastName;
    public final String firstName;

    public TopInfo(final LocalDateTime now, final String lastName, final String firstName) {
        this.now = now;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
