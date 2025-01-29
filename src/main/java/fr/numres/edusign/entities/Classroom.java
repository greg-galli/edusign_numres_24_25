package fr.numres.edusign.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer startDate;
    private Integer endDate;
    private String name;

    @ManyToOne
    private User coordinator;

    @OneToMany(mappedBy = "classroom")
    private List<User> students;

    @OneToMany(mappedBy = "classroom")
    private List<Session> sessions;
}
