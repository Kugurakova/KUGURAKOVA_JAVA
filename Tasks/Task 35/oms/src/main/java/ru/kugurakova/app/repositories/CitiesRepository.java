package ru.kugurakova.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kugurakova.app.dto.CityDto;
import ru.kugurakova.app.models.City;

import java.util.List;

public interface CitiesRepository extends JpaRepository<City, Long> {
    List<City> findAll();
    List<City> findAllByOrderByIdAsc();

}
