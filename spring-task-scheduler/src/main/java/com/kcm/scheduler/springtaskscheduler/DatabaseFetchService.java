package com.kcm.scheduler.springtaskscheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseFetchService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void fetchDataFromDatabase() {
        // Replace this with your actual SQL query to fetch data from the database
        String sqlQuery = "SELECT * FROM your_table_name";
        jdbcTemplate.query(sqlQuery, resultSet -> {
            // Process the fetched data here
            System.out.println("Fetched data: " + resultSet.getString("column_name"));
        });
    }
}
