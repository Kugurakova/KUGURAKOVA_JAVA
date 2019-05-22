package ru.kugurakova.app.services;

import ru.kugurakova.app.dto.UnloadPackageDto;
import ru.kugurakova.app.models.UnloadPackage;
import java.util.List;

public interface UnloadPackageService {
    List<UnloadPackageDto> getUnloadPackages();
    UnloadPackage getUnloadPackageById(Long id);
    void add (UnloadPackage unloadPackage);
    void save(UnloadPackage unloadPackage);

}
