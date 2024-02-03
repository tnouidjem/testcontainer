package com.example.spring_db.rest;


import java.util.List;

import com.example.spring_db.enetitiy.Singer;
import com.example.spring_db.repository.SingerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingerRest {

    private final SingerRepository repo;

    public SingerRest(SingerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/api/singers")
    List<Singer> getAll() {
        return repo.findAll();
    }
}