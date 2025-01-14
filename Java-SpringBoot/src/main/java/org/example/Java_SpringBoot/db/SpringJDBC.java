package org.example.Java_SpringBoot.db;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class SpringJDBC implements DBREpo {

@Autowired
private JdbcTemplate jdbcTemplate;
@Autowired
private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @Override
    public List<Person> getPersonData() {
        return jdbcTemplate.query("SELECT * FROM person;", new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
                return Person.builder().name(rs.getString("name")).id(rs.getInt("id")).build();
               // return new Person(rs.getString(1),rs.getInt(1));

            }
        });
       
    }

    @Override
    public int addPerson(Person person) {

        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("name" ,person.getName());
        parameterSource.addValue("id" ,person.getId());

      return namedParameterJdbcTemplate.update("INSERT INTO person (name, id) VALUES (:name,:id)",parameterSource);
       // return namedParameterJdbcTemplate.update(namedPersonUpdateQuery, parameterSource);

    }
}