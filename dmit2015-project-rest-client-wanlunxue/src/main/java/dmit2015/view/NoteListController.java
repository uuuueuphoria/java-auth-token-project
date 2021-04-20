package dmit2015.view;

import dmit2015.client.Note;
import dmit2015.client.NoteService;
import dmit2015.security.LoginSession;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.omnifaces.util.Messages;
import lombok.Getter;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named("currentNoteListController")
@ViewScoped
public class NoteListController implements Serializable {

    @Inject
    @RestClient
    private NoteService _noteService;

    @Inject
    private LoginSession _loginSession;

    @Getter
    private List<Note> noteList;

    @Getter
    private List<Note> noteByUser;

    @PostConstruct  // After @Inject is complete
    public void init() {
        try {
            noteList = _noteService.findAll();
        } catch (RuntimeException ex) {
            Messages.addGlobalError(ex.getMessage());
        }
    }


    public List<Note> find() {
        String authorization = _loginSession.getAuthorization();
        try {
            noteByUser = _noteService.getNoteByUser(authorization);
        } catch (RuntimeException ex) {
            Messages.addGlobalError(ex.getMessage());
        }
        return noteByUser;
    }
}