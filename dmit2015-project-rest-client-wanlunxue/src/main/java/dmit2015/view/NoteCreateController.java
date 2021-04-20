package dmit2015.view;

import dmit2015.client.Note;
import dmit2015.client.NoteService;
import dmit2015.security.LoginSession;
import lombok.Getter;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.omnifaces.util.Messages;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("currentNoteCreateController")
@RequestScoped
public class NoteCreateController {

    @Inject
    @RestClient
    private NoteService _noteService;

    @Inject
    private LoginSession _loginSession;

    @Getter
    private Note newNote = new Note();

    public String onCreate() {
        String nextPage = "";
        String authorization = _loginSession.getAuthorization();
        try {
            _noteService.create(newNote,authorization);
            Messages.addFlashGlobalInfo("Create was successful.");
            nextPage = "index?faces-redirect=true";
        } catch (Exception e) {
            e.printStackTrace();
            Messages.addGlobalError("Create was not successful.");
        }
        return nextPage;
    }

}
