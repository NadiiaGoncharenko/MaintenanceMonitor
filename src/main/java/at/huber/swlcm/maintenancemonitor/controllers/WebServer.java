package at.huber.swlcm.maintenancemonitor.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path( "/api/maintenanceMode/" )
public class WebServer {
    static String status = "-";

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getPage() {
        Response.ResponseBuilder rb = Response.ok(status);
        return rb.header("Access-Control-Allow-Origin", "*").build();
    }

    @POST
    @Path("/{newStatus}")
    public String setStatus(@PathParam("newStatus") String newStatus) {
        status = newStatus;
        return newStatus;
    }
}
