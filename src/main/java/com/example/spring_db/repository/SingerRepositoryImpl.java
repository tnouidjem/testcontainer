package com.example.spring_db.repository;

import com.example.spring_db.enetitiy.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.swing.plaf.SliderUI;
import java.util.Arrays;
import java.util.List;

@Repository
public class SingerRepositoryImpl {

    private DataSource dataSource;

    private SelectAllSingers selectAllSingers;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        selectAllSingers = new SelectAllSingers(dataSource);

    }

    public List<Singer> getAllSinger() {
        Singer object = selectAllSingers.findObject(1);
        return Arrays.asList(object);
    }


}
