package com.goggxi.simpleapistudent.config;

import com.goggxi.simpleapistudent.model.Student;
import com.goggxi.simpleapistudent.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student rifkan = new Student(
                    1L,
                    "Moh Rifkan",
                    "mohrifkan@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 5),
                    22
            );
            Student ipang = new Student(
                    2L,
                    "Ipang",
                    "ipang@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 5),
                    22
            );
            Student goggxi = new Student(
                    3L,
                    "Goggxi",
                    "goggxi@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 5),
                    22
            );

            repository.saveAll(
                    List.of(rifkan, ipang, goggxi)
            );
        };
    }

}
