package fi.haagahelia.studentListReact;

import fi.haagahelia.studentListReact.domain.Student;
import fi.haagahelia.studentListReact.domain.StudentRepository;

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
    public CommandLineRunner demo(StudentRepository repository) {
        return (args) -> {
            repository.save(new Student("Frodo", "Baggins", "frodo@.com"));
            repository.save(new Student("Kou", "Kou", "koukou@.com"));
            repository.save(new Student("Mai", "Mai", "maimai@.com"));
            repository.save(new Student("John", "John", "john@john.com"));
        };
    }
}

