package com.medviv.auth.api.v1;

import static com.medviv.auth.config.Paths.BUILD_URL;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Path(BUILD_URL)
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class BuildResource {
    @Value("${application.version}")
    private String version;

    @PermitAll
    @GET
    public Response getVersion() {
        return Response.ok().entity(version).build();
    }
}
