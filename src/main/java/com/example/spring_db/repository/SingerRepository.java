package com.example.spring_db.repository;

import com.example.spring_db.enetitiy.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SingerRepository extends JpaRepository<Singer, Integer> {
    List<Singer> findByName(String name);
}

