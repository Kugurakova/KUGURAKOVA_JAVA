package ru.kugurakova.app.services;

import ru.kugurakova.app.dto.UnloadDataDto;
import ru.kugurakova.app.models.UnloadData;
import java.util.List;

public interface UnloadDataService {
    List<UnloadDataDto> getUnloadData();
    UnloadData getUnloadData(Long id);
    void add(UnloadData unloadData);
    void save(UnloadData unloadData);
}