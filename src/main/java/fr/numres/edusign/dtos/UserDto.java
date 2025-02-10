package fr.numres.edusign.dtos;

import fr.numres.edusign.entities.Classroom;
import fr.numres.edusign.entities.Session;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String matricule;
    private Date dateCreated;
    private Date lastUpdated;
    private List<Classroom> responsibilities;
    private Classroom classroom;
    private List<Session> sessions;
}
