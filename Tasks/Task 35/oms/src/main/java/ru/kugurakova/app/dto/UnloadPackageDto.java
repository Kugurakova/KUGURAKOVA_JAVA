package ru.kugurakova.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kugurakova.app.models.UnloadPackage;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnloadPackageDto {
    private Long id;
    private String name;
    private String description;
    private String code;
    private String zipCommand;
    private String unzipCommand;
    private String archiveFormat;
    private UnloadPackageTypeDto unloadPackageType;
    private Long orderNum;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private CityDto city;

    public UnloadPackageDto(UnloadPackage unloadPackage) {
        this.id = unloadPackage.getId();
        this.name = unloadPackage.getName();
        this.description = unloadPackage.getDescription();
        this.code = unloadPackage.getCode();
        this.zipCommand = unloadPackage.getZipCommand();
        this.unzipCommand = unloadPackage.getUnzipCommand();
        this.archiveFormat = unloadPackage.getArchiveFormat();
        this.unloadPackageType = unloadPackage.getUnloadPackageType() == null ? null : new UnloadPackageTypeDto(unloadPackage.getUnloadPackageType());
        this.orderNum = unloadPackage.getOrderNum();
        this.startDate = unloadPackage.getStartDate();
        this.endDate = unloadPackage.getEndDate();
        this.city = unloadPackage.getCity() == null ? null : new CityDto(unloadPackage.getCity());
    }
}