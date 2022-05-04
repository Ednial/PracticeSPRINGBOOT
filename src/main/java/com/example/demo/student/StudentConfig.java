package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student ericxon=new Student("Ericxon","ericxonb@gmail.com",
                    LocalDate.of(1998, Month.MARCH,3),24);

            Student karla=new Student("Karla","karlita@gmail.com",
                    LocalDate.of(1998, Month.DECEMBER,24),23);
            repository.saveAll(
                    List.of(ericxon,karla)
            );
        };
    }
}
