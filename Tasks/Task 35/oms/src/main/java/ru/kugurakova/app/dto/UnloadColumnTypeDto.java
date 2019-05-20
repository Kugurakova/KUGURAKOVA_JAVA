package ru.kugurakova.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kugurakova.app.models.UnloadColumnType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnloadColumnTypeDto {
    Long id;
    String name;
    public UnloadColumnTypeDto(UnloadColumnType unloadColumnType){
        this.id=unloadColumnType.getId();
        this.name=unloadColumnType.getName();
    }
}
