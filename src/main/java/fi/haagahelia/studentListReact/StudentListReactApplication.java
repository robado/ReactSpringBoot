package fi.haagahelia.studentListReact;

import fi.haagahelia.studentListReact.domain.Student;
import fi.haagahelia.studentListReact.domain.StudentRepository;

import fi.haagahelia.studentListReact.domain.User;
import fi.haagahelia.studentListReact.domain.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentListReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentListReactApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepository repository, UserRepository userrepo) {
        return (args) -> {
            User user1 = new User("user","$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
            User user2 = new User("admin",	"$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
            userrepo.save(user1);
            userrepo.save(user2);

            repository.save(new Student("Frodo", "Baggins", "frodo@.com"));
            repository.save(new Student("Kou", "Kou", "koukou@.com"));
            repository.save(new Student("Mai", "Mai", "maimai@.com"));
            repository.save(new Student("John", "John", "john@john.com"));
        };
    }
}

