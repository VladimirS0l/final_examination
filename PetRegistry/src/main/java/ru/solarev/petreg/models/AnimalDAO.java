package ru.solarev.petreg.models;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalDAO {

    private final JdbcTemplate jdbcTemplate;

    public AnimalDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Animal> index(){
        return jdbcTemplate.query("SELECT * FROM Animals", new BeanPropertyRowMapper<>(Animal.class));
    }

    public Animal show(int id){
        return jdbcTemplate.query("SELECT * FROM Animals WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Animal.class)).stream().findAny().orElse(null);
    }

    public void save(Animal animal){
        jdbcTemplate.update("INSERT INTO Animals(name, typeanimal, age) VALUES (?, ?, ?)", animal.getName(),
                animal.getTypeAnimal(), animal.getAge());
    }

    public void update(int id, Animal updateAnimal) {
        jdbcTemplate.update("UPDATE Animals SET name=?, typeAnimal=?, age=? WHERE id=?", updateAnimal.getName(),
                updateAnimal.getTypeAnimal(), updateAnimal.getAge(), id);
    }

    public void delete(int id){
        jdbcTemplate.update("DELETE FROM Animals WHERE id=?", id);
    }




}


