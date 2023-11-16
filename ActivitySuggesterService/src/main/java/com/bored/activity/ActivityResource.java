package com.bored.activity;

import com.google.gson.Gson;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/activity")
public class ActivityResource {

    @Path("/heartbeat")
    @GET
    @Produces("text/plain")
    public Response heartbeat() {
        return Response.status(200).entity("Activity Suggester Service is running OK").build();
    }

    @GET
    @Produces("text/plain")
    public Response getActivity() {
        Activity freshActivity = ActivityUtils.fetchActivity();

        Gson gson = new Gson();
        String response = gson.toJson(freshActivity);

        return Response.status(200).entity(response).build();
    }

}