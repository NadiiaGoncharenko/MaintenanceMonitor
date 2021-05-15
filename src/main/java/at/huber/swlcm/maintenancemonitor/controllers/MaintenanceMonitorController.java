package at.huber.swlcm.maintenancemonitor.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path( "/api/maintenanceMode/" )
public class MaintenanceMonitorController {

    public static String status = "-";

    @GET
    @Produces(MediaType.TEXT_HTML)
    public static Response getStatus() {
        System.out.println("Current message is: \""+status+"\"");

        Response.ResponseBuilder rb = Response.ok(status);
        return rb.header("Access-Control-Allow-Origin", "*").build();
    }

    @POST
    @Path("/{newStatus}")
    public static String setStatus(@PathParam("newStatus") String newStatus) {
        status = newStatus;
        return status;
    }

    @DELETE
    public static String reset() {
        status = "-";
        return status;
    }
}
