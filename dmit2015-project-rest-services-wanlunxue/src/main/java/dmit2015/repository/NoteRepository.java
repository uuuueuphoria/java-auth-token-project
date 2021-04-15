package dmit2015.repository;
/**
 * This is note repository class, which contains the CRUD function of the note entity class
 *
 * @author  Wanlun Xue
 * @version 1.0
 * @lastModified   2021.04.15
 */

import com.nimbusds.jose.proc.SecurityContext;
import dmit2015.entity.Note;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.print.DocFlavor;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
@Transactional
public class NoteRepository {
    @PersistenceContext(unitName = "h2database-jpa-pu")
    private EntityManager em;


    public void add(@Valid Note newNote) {
        em.persist(newNote);
    }

    public void update(@Valid Note updatedNote) {
        Optional<Note> optionalNote = findById(updatedNote.getId());
        if (optionalNote.isPresent()) {
            Note existingNote = optionalNote.get();
            existingNote.setTitle(updatedNote.getTitle());
            existingNote.setContent(updatedNote.getContent());
            existingNote.setCategory(updatedNote.getCategory());
            existingNote.setLastModifiedDateTime(updatedNote.getLastModifiedDateTime());
            em.merge(existingNote);
            em.flush();
        }
    }

        public void remove(Note existingNote) {
        em.remove(em.merge(existingNote));
        em.flush();
    }

    public void remove(Long id) {
        Optional<Note> optionalNote = findById(id);
        if (optionalNote.isPresent()) {
            Note existingNote = optionalNote.get();
            remove(existingNote);
        }
    }

    public Optional<Note> findById(Long id) {
        Optional<Note> optionalNote = Optional.empty();
        try {
            Note querySingleResult = em.find(Note.class, id);
            if (querySingleResult != null) {
                optionalNote = Optional.of(querySingleResult);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return optionalNote;
    }

    public List<Note> findbyUsername(String name) {
        return em.createQuery(
                "SELECT n FROM Note n WHERE n.username=:name"
                , Note.class)
                .setParameter("name",name)
                .getResultList();
    }

    public List<Note> findAll() {
        return em.createQuery(
                "SELECT n FROM Note n "
                , Note.class)
                .getResultList();
    }

}