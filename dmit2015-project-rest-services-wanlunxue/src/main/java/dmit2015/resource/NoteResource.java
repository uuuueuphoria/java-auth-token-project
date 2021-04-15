package dmit2015.resource;

/**
 * This is resource class, perform CRUD operations on Note entity
 *
 * @author  Wanlun Xue
 * @version 1.0
 * @lastModified   2021.04.15
 */



/**
 * * Web API with CRUD methods for managing Note.
 *
 *  URI						Http Method     Request Body		                        Description
 * 	----------------------  -----------		------------------------------------------- ------------------------------------------
 *	/Note       			POST			{"category":"other",                         Create a new Note
 *                                         	"title":"test 3",
 *                                         	"content":"this is content 3",
 *                                         "createdDateTime":"2021-02-20T12:22:00",
 *                                         "lastModifiedDateTime":"2021-02-21T02:20:00"
 *                                         }
 * 	/Note/{id}			    GET			                                                Find one Note with a id value
 * 	/Note   		        GET			                                                Find all Notes
 * 	/Note/{id}              PUT             {"id":3,                                    Update the Note
 * 	                                        "content":"Submitted DMIT2015 assignment",
 * 	                                        "category":"study","title":"test success",
 * 	                                        "createdDateTime":"2021-02-20T12:22:00",
 * 	                                        "lastModifiedDateTime":"2021-02-21T02:20:00",
 * 	                                        "title":"test 3"}
 *
 * 	/Note/{id}		    	DELETE			                                            Remove the Note
 *

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/1

 curl -i -X POST http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note \
 -d '{"category":"other", "content":"this is content 3","title":"test 3"}' \
 -H 'Authorization: Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJ1cG4iOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJpc3MiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJhdWQiOiJqd3QtYXVkaWVuY2UiLCJncm91cHMiOlsiVVNFUiJdLCJqdGkiOiJiNzA4M2FiMy02MDY5LTQyMTgtYjJmMC0yODVhZWUwZjY4ODUiLCJpYXQiOjE2MTg1MjU4ODYsImV4cCI6MTYxOTk2NTg4Nn0.gapRZb5kEmT3ww0p7y7nYcPRJuxMw29EUW34RMsppoeC41Eflm1PiP4Y4fpquOy0hTI5mpk2wDlIHncgTQTrM9rkoeFCTaip_g_LDUB0Wb7_OT91y4ZRcGKWVFwAr8iZOMd4bxk5LowAWRqUlT8qzD1tvN4C2lIx1c50uH1SrfHQjgl7ShUR31UISWQaERaaxq6_dvxTMpEA_UYtPrhdycifpbE3fA7bXLumR8PPMGB_3egJR9hoMHOvXO3Qe4BWMOoqdICH64kyL0AGPmHLhyX_8UPPIcoU0ocn5hZZ4p0Bh3524d4CkNyHuIUJJ-7n-WmBm2T_R03Gx4qsB-_xBg' \
 -H 'Content-Type:application/json'

 curl -i -X POST http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note \
 -d '{"category":"other", "content":"this is content 4","title":"test 4"}' \
 -H 'Authorization: Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJ1cG4iOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJpc3MiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJhdWQiOiJqd3QtYXVkaWVuY2UiLCJncm91cHMiOlsiVVNFUiJdLCJqdGkiOiJiNzA4M2FiMy02MDY5LTQyMTgtYjJmMC0yODVhZWUwZjY4ODUiLCJpYXQiOjE2MTg1MjU4ODYsImV4cCI6MTYxOTk2NTg4Nn0.gapRZb5kEmT3ww0p7y7nYcPRJuxMw29EUW34RMsppoeC41Eflm1PiP4Y4fpquOy0hTI5mpk2wDlIHncgTQTrM9rkoeFCTaip_g_LDUB0Wb7_OT91y4ZRcGKWVFwAr8iZOMd4bxk5LowAWRqUlT8qzD1tvN4C2lIx1c50uH1SrfHQjgl7ShUR31UISWQaERaaxq6_dvxTMpEA_UYtPrhdycifpbE3fA7bXLumR8PPMGB_3egJR9hoMHOvXO3Qe4BWMOoqdICH64kyL0AGPmHLhyX_8UPPIcoU0ocn5hZZ4p0Bh3524d4CkNyHuIUJJ-7n-WmBm2T_R03Gx4qsB-_xBg' \
 -H 'Content-Type:application/json'

 curl -i -X POST http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note \
 -d '{"category":"other", "content":"this is content 5","title":"test 5"}' \
 -H 'Authorization: Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJ1cG4iOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJpc3MiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJhdWQiOiJqd3QtYXVkaWVuY2UiLCJncm91cHMiOlsiVVNFUiJdLCJqdGkiOiJiNzA4M2FiMy02MDY5LTQyMTgtYjJmMC0yODVhZWUwZjY4ODUiLCJpYXQiOjE2MTg1MjU4ODYsImV4cCI6MTYxOTk2NTg4Nn0.gapRZb5kEmT3ww0p7y7nYcPRJuxMw29EUW34RMsppoeC41Eflm1PiP4Y4fpquOy0hTI5mpk2wDlIHncgTQTrM9rkoeFCTaip_g_LDUB0Wb7_OT91y4ZRcGKWVFwAr8iZOMd4bxk5LowAWRqUlT8qzD1tvN4C2lIx1c50uH1SrfHQjgl7ShUR31UISWQaERaaxq6_dvxTMpEA_UYtPrhdycifpbE3fA7bXLumR8PPMGB_3egJR9hoMHOvXO3Qe4BWMOoqdICH64kyL0AGPmHLhyX_8UPPIcoU0ocn5hZZ4p0Bh3524d4CkNyHuIUJJ-7n-WmBm2T_R03Gx4qsB-_xBg' \
 -H 'Content-Type:application/json'

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/3

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/user \
 -H 'Authorization: Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJ1cG4iOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJpc3MiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJhdWQiOiJqd3QtYXVkaWVuY2UiLCJncm91cHMiOlsiVVNFUiJdLCJqdGkiOiJiNzA4M2FiMy02MDY5LTQyMTgtYjJmMC0yODVhZWUwZjY4ODUiLCJpYXQiOjE2MTg1MjU4ODYsImV4cCI6MTYxOTk2NTg4Nn0.gapRZb5kEmT3ww0p7y7nYcPRJuxMw29EUW34RMsppoeC41Eflm1PiP4Y4fpquOy0hTI5mpk2wDlIHncgTQTrM9rkoeFCTaip_g_LDUB0Wb7_OT91y4ZRcGKWVFwAr8iZOMd4bxk5LowAWRqUlT8qzD1tvN4C2lIx1c50uH1SrfHQjgl7ShUR31UISWQaERaaxq6_dvxTMpEA_UYtPrhdycifpbE3fA7bXLumR8PPMGB_3egJR9hoMHOvXO3Qe4BWMOoqdICH64kyL0AGPmHLhyX_8UPPIcoU0ocn5hZZ4p0Bh3524d4CkNyHuIUJJ-7n-WmBm2T_R03Gx4qsB-_xBg'

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/4

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/5


 curl -i -X PUT http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/3 \
 -d '{"id":"3","content":"Submitted DMIT2015 assignment","category":"other","title":"test success"}' \
 -H 'Authorization:Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJ1cG4iOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJpc3MiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJhdWQiOiJqd3QtYXVkaWVuY2UiLCJncm91cHMiOlsiVVNFUiJdLCJqdGkiOiJiNzA4M2FiMy02MDY5LTQyMTgtYjJmMC0yODVhZWUwZjY4ODUiLCJpYXQiOjE2MTg1MjU4ODYsImV4cCI6MTYxOTk2NTg4Nn0.gapRZb5kEmT3ww0p7y7nYcPRJuxMw29EUW34RMsppoeC41Eflm1PiP4Y4fpquOy0hTI5mpk2wDlIHncgTQTrM9rkoeFCTaip_g_LDUB0Wb7_OT91y4ZRcGKWVFwAr8iZOMd4bxk5LowAWRqUlT8qzD1tvN4C2lIx1c50uH1SrfHQjgl7ShUR31UISWQaERaaxq6_dvxTMpEA_UYtPrhdycifpbE3fA7bXLumR8PPMGB_3egJR9hoMHOvXO3Qe4BWMOoqdICH64kyL0AGPmHLhyX_8UPPIcoU0ocn5hZZ4p0Bh3524d4CkNyHuIUJJ-7n-WmBm2T_R03Gx4qsB-_xBg'\
 -H 'Content-Type:application/json'

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/3

 curl -i -X PUT http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/4 \
 -d '{"id":"4","content":"Submitted DMIT2015 assignment","category":"other","title":"test success", "createdDateTime":"2021-02-20T12:22:00","lastModifiedDateTime":"2021-02-22T02:20:00"}' \
 -H 'Authorization:Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJ1cG4iOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJpc3MiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJhdWQiOiJqd3QtYXVkaWVuY2UiLCJncm91cHMiOlsiVVNFUiJdLCJqdGkiOiJiNzA4M2FiMy02MDY5LTQyMTgtYjJmMC0yODVhZWUwZjY4ODUiLCJpYXQiOjE2MTg1MjU4ODYsImV4cCI6MTYxOTk2NTg4Nn0.gapRZb5kEmT3ww0p7y7nYcPRJuxMw29EUW34RMsppoeC41Eflm1PiP4Y4fpquOy0hTI5mpk2wDlIHncgTQTrM9rkoeFCTaip_g_LDUB0Wb7_OT91y4ZRcGKWVFwAr8iZOMd4bxk5LowAWRqUlT8qzD1tvN4C2lIx1c50uH1SrfHQjgl7ShUR31UISWQaERaaxq6_dvxTMpEA_UYtPrhdycifpbE3fA7bXLumR8PPMGB_3egJR9hoMHOvXO3Qe4BWMOoqdICH64kyL0AGPmHLhyX_8UPPIcoU0ocn5hZZ4p0Bh3524d4CkNyHuIUJJ-7n-WmBm2T_R03Gx4qsB-_xBg'\
 -H 'Content-Type:application/json'

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/4

 curl -i -X PUT http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/5 \
 -d '{"id":"5","content":"Submitted DMIT2015 assignment","category":"other","title":"test success", "createdDateTime":"2021-02-20T12:22:00","lastModifiedDateTime":"2021-02-22T02:20:00"}' \
 -H 'Authorization:Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJ1cG4iOiJ1c2VyMDFAZG1pdDIwMTUuY2EiLCJpc3MiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJhdWQiOiJqd3QtYXVkaWVuY2UiLCJncm91cHMiOlsiVVNFUiJdLCJqdGkiOiJiNzA4M2FiMy02MDY5LTQyMTgtYjJmMC0yODVhZWUwZjY4ODUiLCJpYXQiOjE2MTg1MjU4ODYsImV4cCI6MTYxOTk2NTg4Nn0.gapRZb5kEmT3ww0p7y7nYcPRJuxMw29EUW34RMsppoeC41Eflm1PiP4Y4fpquOy0hTI5mpk2wDlIHncgTQTrM9rkoeFCTaip_g_LDUB0Wb7_OT91y4ZRcGKWVFwAr8iZOMd4bxk5LowAWRqUlT8qzD1tvN4C2lIx1c50uH1SrfHQjgl7ShUR31UISWQaERaaxq6_dvxTMpEA_UYtPrhdycifpbE3fA7bXLumR8PPMGB_3egJR9hoMHOvXO3Qe4BWMOoqdICH64kyL0AGPmHLhyX_8UPPIcoU0ocn5hZZ4p0Bh3524d4CkNyHuIUJJ-7n-WmBm2T_R03Gx4qsB-_xBg'\
 -H 'Content-Type:application/json'

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/5

 curl -i -X DELETE http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/3\
 -H 'Authorization: Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhZG1pbjAxQGRtaXQyMDE1LmNhIiwidXBuIjoiYWRtaW4wMUBkbWl0MjAxNS5jYSIsImlzcyI6InF1aWNrc3RhcnQtand0LWlzc3VlciIsImF1ZCI6Imp3dC1hdWRpZW5jZSIsImdyb3VwcyI6WyJBRE1JTiJdLCJqdGkiOiI5ZDBkMDhhMS0zOWQ5LTRkOTUtOWJkZC1jODQzNDBlM2FhNjMiLCJpYXQiOjE2MTg1MjU3OTgsImV4cCI6MTYxOTk2NTc5OH0.YbQvgtvtcBhOPyPnotE9NEWlZkd5ffneChlJmi-3kbpVrDfdlmfLmqxHD6-2S8DtVx4F2eIGwjjV9gY3F3w3_zCaM5vmj1Oql_5XmTB-5u_3a8U8XKxS9B5GQ_EzXJg3LnLj2fjwYL1izAPTVuC5M5pTKS4ne0OUr-piLyHBz9v9KB9otWsh9cD7ncXysyCWSHpjypdT4zXSH4jqs2VDQ0cWKp_RBWaeKmjam5CW0pokL_ECo0siZOSsFoI5d6CxitIflwoulM4a9oqFCS5ctYWNcnbf4r2_gYVV_Ri3mBd2P2JeqPa6JoLzFYA6WnexDRBOjvwHrhZ-lUvBJmVKrA'
 curl -i -X DELETE http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/4\
 -H 'Authorization: Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhZG1pbjAxQGRtaXQyMDE1LmNhIiwidXBuIjoiYWRtaW4wMUBkbWl0MjAxNS5jYSIsImlzcyI6InF1aWNrc3RhcnQtand0LWlzc3VlciIsImF1ZCI6Imp3dC1hdWRpZW5jZSIsImdyb3VwcyI6WyJBRE1JTiJdLCJqdGkiOiI5ZDBkMDhhMS0zOWQ5LTRkOTUtOWJkZC1jODQzNDBlM2FhNjMiLCJpYXQiOjE2MTg1MjU3OTgsImV4cCI6MTYxOTk2NTc5OH0.YbQvgtvtcBhOPyPnotE9NEWlZkd5ffneChlJmi-3kbpVrDfdlmfLmqxHD6-2S8DtVx4F2eIGwjjV9gY3F3w3_zCaM5vmj1Oql_5XmTB-5u_3a8U8XKxS9B5GQ_EzXJg3LnLj2fjwYL1izAPTVuC5M5pTKS4ne0OUr-piLyHBz9v9KB9otWsh9cD7ncXysyCWSHpjypdT4zXSH4jqs2VDQ0cWKp_RBWaeKmjam5CW0pokL_ECo0siZOSsFoI5d6CxitIflwoulM4a9oqFCS5ctYWNcnbf4r2_gYVV_Ri3mBd2P2JeqPa6JoLzFYA6WnexDRBOjvwHrhZ-lUvBJmVKrA'
 curl -i -X DELETE http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/5\
 -H 'Authorization: Bearer eyJraWQiOiJxdWlja3N0YXJ0LWp3dC1pc3N1ZXIiLCJ0eXAiOiJqd3QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhZG1pbjAxQGRtaXQyMDE1LmNhIiwidXBuIjoiYWRtaW4wMUBkbWl0MjAxNS5jYSIsImlzcyI6InF1aWNrc3RhcnQtand0LWlzc3VlciIsImF1ZCI6Imp3dC1hdWRpZW5jZSIsImdyb3VwcyI6WyJBRE1JTiJdLCJqdGkiOiI5ZDBkMDhhMS0zOWQ5LTRkOTUtOWJkZC1jODQzNDBlM2FhNjMiLCJpYXQiOjE2MTg1MjU3OTgsImV4cCI6MTYxOTk2NTc5OH0.YbQvgtvtcBhOPyPnotE9NEWlZkd5ffneChlJmi-3kbpVrDfdlmfLmqxHD6-2S8DtVx4F2eIGwjjV9gY3F3w3_zCaM5vmj1Oql_5XmTB-5u_3a8U8XKxS9B5GQ_EzXJg3LnLj2fjwYL1izAPTVuC5M5pTKS4ne0OUr-piLyHBz9v9KB9otWsh9cD7ncXysyCWSHpjypdT4zXSH4jqs2VDQ0cWKp_RBWaeKmjam5CW0pokL_ECo0siZOSsFoI5d6CxitIflwoulM4a9oqFCS5ctYWNcnbf4r2_gYVV_Ri3mBd2P2JeqPa6JoLzFYA6WnexDRBOjvwHrhZ-lUvBJmVKrA'

 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/3
 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/4
 curl -i -X GET http://localhost:8080/dmit2015-project-rest-services-wanlunxue/webapi/Note/5

 *
 */
import dmit2015.entity.Note;
import dmit2015.repository.NoteRepository;
import org.eclipse.microprofile.jwt.JsonWebToken;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;


@RequestScoped
// This is a CDI-managed bean that is created only once during the life cycle of the application
@Path("Note")	        // All methods of this class are associated this URL path
@Consumes(MediaType.APPLICATION_JSON)	// All methods this class accept only JSON format data
@Produces(MediaType.APPLICATION_JSON)	// All methods returns data that has been converted to JSON format
public class NoteResource {

    @Inject
    private JsonWebToken _callerPrincipal;

    @Context
    private UriInfo uriInfo;

    @Inject
    private NoteRepository noteRepository;

    @RolesAllowed({"USER"})
    @POST   // POST: webapi/Note
    public Response postNote(@Valid Note newNote) {
        if (newNote == null) {
            throw new BadRequestException();
        }
        newNote.setUsername(_callerPrincipal.getName());
        noteRepository.add(newNote);
        URI noteUri = uriInfo.getAbsolutePathBuilder().path(newNote.getId().toString()).build();
        return Response.created(noteUri).build();
    }

    @GET    // GET: webapi/Note/2
    @Path("{id:\\d+}")
    public Response getNote(@PathParam("id") Long id) {
        if(id==null){
            throw new BadRequestException();
        }
        Optional<Note> optionalNote = noteRepository.findById(id);

        if (optionalNote.isEmpty()) {
            throw new NotFoundException();
        }
        Note existingNote = optionalNote.get();

        return Response.ok(existingNote).build();
    }

    @GET    // GET: webapi/Note
    public Response getNote() {
        return Response.ok(noteRepository.findAll()).build();
    }

    @RolesAllowed({"USER"})
    @GET    // GET: webapi/Note/user
    @Path("user")
    public Response getNoteByUser() {
        return Response.ok(noteRepository.findbyUsername(_callerPrincipal.getName()).toString()).build();
    }

    @RolesAllowed({"USER"})
    @PUT    // PUT: webapi/Note/2
    @Path("{id:\\d+}")
    public Response updateNote(@PathParam("id") Long id, @Valid Note updatedNote) {
        if(id==null){
            throw new BadRequestException();
        }
        if (!id.equals(updatedNote.getId())) {
            throw new BadRequestException();
        }

        Optional<Note> optionalNote = noteRepository.findById(id);

        if (optionalNote.isPresent()){
            Note existingNote = optionalNote.get();
            existingNote.setContent(updatedNote.getContent());
            existingNote.setCategory(updatedNote.getCategory());
            existingNote.setTitle(updatedNote.getTitle());
            existingNote.setLastModifiedDateTime(LocalDateTime.now());
            existingNote.setUsername(_callerPrincipal.getName());
            noteRepository.update(existingNote);
            return Response.noContent().build();
        }else{
            throw new NotFoundException();
        }

    }

    @RolesAllowed({"ADMIN"})
    @DELETE // DELETE: webapi/Note/3
    @Path("{id:\\d+}")
    public Response deleteNote(@PathParam("id") Long id) {
        if(id==null){
            throw new BadRequestException();
        }
        Optional<Note> optionalNote = noteRepository.findById(id);

        if (optionalNote.isEmpty()) {
            throw new NotFoundException();
        }

        noteRepository.remove(id);

        return Response.noContent().build();
    }

}

