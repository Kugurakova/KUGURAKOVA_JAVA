package ru.kugurakova.app.services;

import ru.kugurakova.app.dto.UnloadColumnTypeDto;

import java.util.List;

public interface UnloadColumnTypeService {
    List<UnloadColumnTypeDto> getUnloadColumnTypes();
}
