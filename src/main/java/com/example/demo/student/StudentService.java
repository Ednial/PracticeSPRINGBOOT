package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Ericxon","Ericxonb@gmail.com", LocalDate.of(1998, Month.MARCH,03),24)
        );
    }
}