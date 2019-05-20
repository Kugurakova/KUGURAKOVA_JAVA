package ru.kugurakova.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kugurakova.app.models.UnloadPackageType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnloadPackageTypeDto {
    private Long id;
    private String name;
    public UnloadPackageTypeDto(UnloadPackageType unloadPackageType){
        this.id=unloadPackageType.getId();
        this.name=unloadPackageType.getName();

    }

}
