package ru.kugurakova.app.services;

import ru.kugurakova.app.dto.UnloadPackageTypeDto;

import java.util.List;

public interface UnloadPackageTypeService {
    List<UnloadPackageTypeDto> getUnloadPackageTypes();
}