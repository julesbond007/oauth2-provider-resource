package com.medviv.rest.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Path("build")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class BuildResource {
    @Value("${application.version}")
    private String version;

    @GET
    public Response getVersion() {
        return Response.ok().entity(version).build();
    }
}
