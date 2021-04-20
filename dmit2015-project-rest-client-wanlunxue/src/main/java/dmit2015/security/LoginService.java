/**
 * This is login class, which include username, password as well as submit and authentication function
 *
 * @author  Wanlun Xue
 * @version 1.0
 * @lastModified   2021.03.23
 */

package dmit2015.security;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/jwt")
@RegisterRestClient(baseUri = "http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi")
public interface LoginService {

    @POST
    @Path("/jsonLogin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    String jsonLogin(JsonObject credentials);

    @POST
    @Path("/formLogin")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    String formLogin(@FormParam("j_username") String username, @FormParam("j_password") String password);
}