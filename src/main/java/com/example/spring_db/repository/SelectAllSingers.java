package com.example.spring_db.repository;

import com.example.spring_db.enetitiy.Singer;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllSingers extends MappingSqlQuery<Singer> {

    public SelectAllSingers(DataSource dataSource) {
        super(dataSource, "SELECT * FROM SINGER");
    }

    @Override
    protected Singer mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        String name = rs.getString("name");
        return null;
    }
}
