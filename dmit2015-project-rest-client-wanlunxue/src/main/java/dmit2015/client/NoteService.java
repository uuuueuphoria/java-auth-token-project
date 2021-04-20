package dmit2015.client;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.*;
import java.util.List;

@Path("/Note")
@RegisterRestClient(baseUri = "http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi")

public interface NoteService {

    @GET
    List<Note> findAll();

    @GET
    @Path("{id}")
    Note findOneById(@PathParam("id") Long id);

    @GET
    @Path("/user")
    List<Note> getNoteByUser(@HeaderParam("Authorization") String authorization);

    @POST
    String create(Note newNote,@HeaderParam("Authorization") String authorization);


}
