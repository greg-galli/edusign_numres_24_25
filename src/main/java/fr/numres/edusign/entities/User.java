package fr.numres.edusign.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Table(name = "users")
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;
    private String matricule;
    @CreationTimestamp
    private Date dateCreated;
    @UpdateTimestamp
    private Date lastUpdated;

    @OneToMany(mappedBy = "coordinator")
    private List<Classroom> responsibilities;

    @ManyToOne
    private Classroom classroom;

    @OneToMany(mappedBy = "teacher")
    private List<Session> sessions;
}
