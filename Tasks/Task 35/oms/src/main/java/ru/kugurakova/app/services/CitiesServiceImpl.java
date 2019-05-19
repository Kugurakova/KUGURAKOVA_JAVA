package ru.kugurakova.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kugurakova.app.dto.CityDto;
import ru.kugurakova.app.models.City;
import ru.kugurakova.app.repositories.CitiesRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CitiesServiceImpl implements CitiesService {
    @Autowired
    private CitiesRepository citiesRepository;

    @Override
    public List<CityDto> getCities() {
        return citiesRepository.findAllByOrderByIdAsc().stream().map(CityDto::new).collect(Collectors.toList());
    }
    @Override
    public City getCityById(Long id){ return citiesRepository.getOne(id);}

    @Override
    public void save(City city){
        citiesRepository.save(city);
    }

    @Override
    public void add(City city) {
        citiesRepository.save(city);
    }

}
