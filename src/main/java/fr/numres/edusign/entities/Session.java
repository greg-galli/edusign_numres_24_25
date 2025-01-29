package fr.numres.edusign.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "sessions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startAt;
    private Date endAt;

    @ManyToOne
    private Classroom classroom;

    @ManyToOne
    private User teacher;

    @ManyToOne
    private Subject subject;

}
