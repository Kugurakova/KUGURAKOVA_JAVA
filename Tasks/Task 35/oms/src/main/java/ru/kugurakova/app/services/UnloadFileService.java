package ru.kugurakova.app.services;

import ru.kugurakova.app.dto.UnloadFileDto;
import ru.kugurakova.app.models.UnloadFile;
import java.util.List;

public interface UnloadFileService {
    List<UnloadFileDto> getUnloadFiles();
    UnloadFile getUnloadFileById(Long id);
    void save (UnloadFile unloadFile);
    void add (UnloadFile unloadFile);
}

