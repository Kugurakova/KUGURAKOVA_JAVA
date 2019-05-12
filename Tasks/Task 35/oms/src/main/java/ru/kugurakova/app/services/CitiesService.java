package ru.kugurakova.app.services;

import ru.kugurakova.app.dto.CityDto;
import ru.kugurakova.app.models.City;
import java.util.List;

public interface CitiesService {
    List<CityDto> getCities();
    City getCityById(Long id);
    void add(City city);
    void save(City city);
}
