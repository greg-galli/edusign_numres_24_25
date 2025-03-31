package fr.numres.edusign;

import fr.numres.edusign.entities.User;
import fr.numres.edusign.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EdusignNumres2425Application {

    public static void main(String[] args) {
        SpringApplication.run(EdusignNumres2425Application.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository)
    {
        return args -> {
            User user = User.builder()
                    .name("John Doe")
                    .password("password")
                    .email("j.d@gmail.com")
                    .matricule("123456")
                    .build();
            userRepository.save(user);
        };
    }
}
