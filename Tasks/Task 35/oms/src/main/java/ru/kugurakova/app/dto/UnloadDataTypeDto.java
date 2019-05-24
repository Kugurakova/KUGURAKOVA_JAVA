package ru.kugurakova.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kugurakova.app.models.UnloadDataType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnloadDataTypeDto {
    Long id;
    String name;

    public UnloadDataTypeDto(UnloadDataType unloadDataType){
        this.id = unloadDataType.getId();
        this.name = unloadDataType.getName();
    }
}