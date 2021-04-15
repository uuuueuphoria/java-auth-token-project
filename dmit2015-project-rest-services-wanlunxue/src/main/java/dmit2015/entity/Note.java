package dmit2015.entity;
/**
 * This is a note class, use to track the note create datetime, note title, category, content and last modified datetime
 *
 * @author  Wanlun Xue
 * @version 1.0
 * @lastModified   2021.04.15
 */

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Note implements Serializable{

    @Id                 // This is the primary key field
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // This primary key field is generated by the database
    @Column(nullable = false)
    private Long id;

    @Column(length = 30, nullable = false)
    @NotBlank(message = "The Title field is required.")
    @Size(min = 1, max = 30, message = "The field Title must be a string with a minimum length of {min} and a maximum length of {max}.")
    private String title;

    @Column
    private String username;

    @Column(nullable = false)
    private LocalDateTime createdDateTime;

    @Column
    @NotBlank(message = "The category field is required.")
    @Pattern(regexp = "(?i)study|(?i)work|(?i)lifestyle|(?i)other",message = "Your category must be study/work/lifestyle or other")
    private String category;

    @Column(length = 1, nullable = false)
    @NotBlank(message = "The content must be filled")
    @Size(min = 1, max = 3000, message = "The field content must be a string with a minimum length of {min} and a maximum length of {max}.")
    private String content;

    @Column(nullable = false)
    private LocalDateTime lastModifiedDateTime;

    @PrePersist
    public void prePersist(){
        createdDateTime=LocalDateTime.now();
        lastModifiedDateTime=LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        lastModifiedDateTime=LocalDateTime.now();
    }
     //@Version
     //private Integer version;
}