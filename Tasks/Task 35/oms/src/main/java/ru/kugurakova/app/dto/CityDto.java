package ru.kugurakova.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kugurakova.app.models.City;

@Data
public class CityDto {
    private Long id;
    private String name;
    private String guid;
    public CityDto(City city){
        this.id=city.getId();
        this.name=city.getName();
        this.guid=city.getGuid();
    }

}
