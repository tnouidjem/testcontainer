package com.example.spring_db;

import com.example.spring_db.enetitiy.Singer;
import com.example.spring_db.repository.SingerRepository;
import com.example.spring_db.repository.SingerRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDbApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringDbApplication.class, args);
        SingerRepositoryImpl singerRepository = (SingerRepositoryImpl) run.getBean("singerRepositoryImpl");
        List<Singer> toto = singerRepository.getAllSinger();
    }

}
