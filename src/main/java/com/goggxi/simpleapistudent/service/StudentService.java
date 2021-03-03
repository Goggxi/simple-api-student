package com.goggxi.simpleapistudent.service;

import com.goggxi.simpleapistudent.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Moh Rifkan",
                        "goggxi@gmail.com",
                        LocalDate.of(1998, Month.AUGUST, 5),
                        22
                ),
                new Student(
                        2L,
                        "Ipang",
                        "ipang@gmail.com",
                        LocalDate.of(1998, Month.AUGUST, 5),
                        22
                )
        );
    }
}
