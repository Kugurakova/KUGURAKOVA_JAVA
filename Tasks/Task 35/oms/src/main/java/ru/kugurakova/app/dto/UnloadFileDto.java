package ru.kugurakova.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kugurakova.app.models.UnloadFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnloadFileDto {
    private Long id;
    private String name;
    private String title;
    private String code;
    private String version;
    private String fileType;
    private UnloadPackageDto unloadPackage;
    private Boolean flMain;
    private String codePage;
public UnloadFileDto(UnloadFile unloadFile){
    this.id = unloadFile.getId();
    this.name = unloadFile.getName();
    this.title = unloadFile.getTitle();
    this.code = unloadFile.getCode();
    this.version = unloadFile.getVersion();
    this.fileType = unloadFile.getFileType();
    this.unloadPackage = unloadFile.getUnloadPackage() == null ? null : new UnloadPackageDto(unloadFile.getUnloadPackage());
    this.flMain = unloadFile.getFlMain();
    this.codePage = unloadFile.getCodePage();
}
}
