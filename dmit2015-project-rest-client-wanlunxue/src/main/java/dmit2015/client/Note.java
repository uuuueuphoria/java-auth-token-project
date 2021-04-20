package dmit2015.client;

/**
 * This is a note class, use to track the note create datetime, note title, category, content and last modified datetime
 *
 * @author  Wanlun Xue
 * @version 1.0
 * @lastModified   2021.04.16
 */
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Note {

    private Long id;

    private String username;

    private String title;

    private LocalDateTime createdDateTime;

    private String category;

    private String content;

    private LocalDateTime lastModifiedDateTime;
}
